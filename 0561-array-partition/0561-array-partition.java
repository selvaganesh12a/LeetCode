class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i < nums.length - 1; i+=2){
            ans += Math.min(nums[i],nums[i+1]);
        }
        return ans;
    }
}