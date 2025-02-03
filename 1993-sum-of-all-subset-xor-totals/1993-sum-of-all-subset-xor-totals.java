class Solution {
    public int subsetXORSum(int[] nums) {
       List<List<Integer>> sub = subset(nums);
        int ans = 0;
        for(int i = 0; i < sub.size(); i++){
            int temp = 0;
            for(int j = 0; j < sub.get(i).size(); j++){
                temp ^= sub.get(i).get(j);
            }
            ans += temp;
        }
        return ans;
    }
    public static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int total = 1 << nums.length;
        for(int i = 0; i < total; i++){
            List<Integer> sub = new ArrayList<>();
            for(int j = 0; j < nums.length; j++){
                if((i & (1 << j)) != 0){
                    sub.add(nums[j]);
                }
            }
            result.add(sub);
        }
        return result;  
    }
}