class Solution {
    public int maxProductDifference(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        ans = (nums[nums.length - 1]*nums[nums.length - 2]) - (nums[0]*nums[1]);
        return ans;
    }
}