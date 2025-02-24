class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        Collections.sort(list);
        int idx = 0;
        int c = 1;
        for (int i = 0; i < n; i++) {
            for(int j = list.size() - 1; j >= 0; j--){
                if(map.get(list.get(j)) == c){
                    for(int k = 0; k < map.get(list.get(j)); k++){
                        ans[idx++] = list.get(j);
                    }
                }
            }
            c++;
        }
        return ans;
    }
}