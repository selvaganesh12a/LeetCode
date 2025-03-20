class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int ans = 0, n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j]) && ans < (nums[i]^nums[j])) ans = nums[i]^nums[j];
            }
        }
        return ans;
    }
}