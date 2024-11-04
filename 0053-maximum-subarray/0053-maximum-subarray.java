class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int idx = 0;
        int res = Integer.MIN_VALUE;
        for(idx = 0; idx  < nums.length; idx++){
            sum += nums[idx];
            if(sum > res){
                res = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return res; 
    }
}