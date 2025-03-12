class Solution {
    public int maximumCount(int[] nums) {
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0) ans[0]++;
            else if(nums[i] > 0) ans[1]++;
        }

        return Math.max(ans[0],ans[1]);
    }
}