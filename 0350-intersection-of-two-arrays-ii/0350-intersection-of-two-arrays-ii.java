class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i : nums1) map1.put(i,map1.getOrDefault(i,0) + 1);
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i : nums2) map2.put(i,map2.getOrDefault(i,0) + 1);
        for(int i : nums1){
            if(map2.getOrDefault(i,0) > 0){
                if(Math.min(map1.get(i),map2.get(i)) > 0){
                    list.add(i);
                }
                map1.put(i,map1.get(i) - 1);
                map2.put(i,map2.get(i) - 1);
            }
        }
        int[] ans = new int[list.size()];
        int idx = 0;
        for(int i: list) ans[idx++] = i;
        return ans;
    }
}