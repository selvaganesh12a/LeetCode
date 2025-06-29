class Solution {
    public int maximizeSum(int[] nums, int k) {
        int ans = 0, n = nums.length, max = 0;
        for(int i = 0; i < n; i++) max = Math.max(max,nums[i]);
        for(int i = 0; i < k; i++) ans += max++;
        return ans;
    }
}