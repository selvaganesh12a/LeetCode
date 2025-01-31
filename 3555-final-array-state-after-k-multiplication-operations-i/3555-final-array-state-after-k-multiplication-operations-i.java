class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int min = nums[0];
        int idx = 0;
        for (int i = 0; i < k; i++) {
            min = nums[0];
            idx = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < min){
                    min = nums[j];
                    idx = j;
                }
            }
            nums[idx] *= multiplier;
        }
        return nums;
    }
}