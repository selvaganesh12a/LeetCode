class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return countSubarrays(nums,right) - countSubarrays(nums,left - 1);
    }
    public static int countSubarrays(int[] nums, int bound) {
    int count = 0, total = 0;
    for (int num : nums) {
        if (num <= bound) {
            total++;
            count += total; 
        } else {
            total = 0; 
        }
    }
    return count;
}
}