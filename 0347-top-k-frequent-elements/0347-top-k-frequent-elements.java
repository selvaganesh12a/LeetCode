class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums) map.put(i,map.getOrDefault(i,0) + 1);
        ArrayList<Integer> order = new ArrayList<>();
        while(k > 0){
            for(int i : map.keySet()){
                if(map.get(i) > 0 && map.get(i) > k) {
                    order.add(i);
                    map.put(i,map.get(i) - map.get(i));
                }
            }
            for(int i : map.keySet()){
                if(map.get(i) > 0 && map.get(i) == k) {
                    order.add(i);
                    map.put(i,map.get(i) - map.get(i));
                }
            }
            k--;
        }
        int idx = 0;
        for (int i : order) {
            if(idx < ans.length) ans[idx++] = i;
            else break;
        }
        return ans;
    }
}