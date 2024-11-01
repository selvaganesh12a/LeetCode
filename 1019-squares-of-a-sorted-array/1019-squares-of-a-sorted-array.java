class Solution {
    public int[] sortedSquares(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            nums[i] = temp*temp;
        }
        Arrays.sort(nums);
        return nums;
    }
}