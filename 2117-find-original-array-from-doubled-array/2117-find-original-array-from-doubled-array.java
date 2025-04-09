class Solution {
    public int[] findOriginalArray(int[] nums) {
        int n = nums.length;
        if(n%2 == 1) return new int[]{};
        int[] ans = new int[n/2];
        Arrays.sort(nums);

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        int idx = 0;
        for (int i : nums) {
            if(map.get(i) > 0){
                int twice = i*2;
                if(map.getOrDefault(twice,0) > 0){
                    ans[idx++] = i;
                    map.put(i,map.get(i) - 1);
                    map.put(twice,map.get(twice) - 1);
                }
            }
        }
        for (int i : map.keySet()) {
            if(map.get(i) > 0) return new int[] {};
        }
        return ans;
    }
}