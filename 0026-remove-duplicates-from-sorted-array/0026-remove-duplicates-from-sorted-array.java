class Solution {
    public static int removeDuplicates(int[] nums) {
        int idx = 1;
        int base = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if(base < nums[i]){
                base = nums[i];
                nums[idx] = nums[i];
                idx += 1;
                count += 1;
            }
        }
        return count;
    }
}