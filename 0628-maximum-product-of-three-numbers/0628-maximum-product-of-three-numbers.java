class Solution {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int prod1 = 1;
        int prod2 = 1;
        prod1 = nums[0]*nums[1]*nums[nums.length - 1];
        for (int i = nums.length - 1; i >= nums.length - 3; i--) {
            prod2 *= nums[i];
        }
        if(prod2 > prod1){
            return prod2;
        }
        return prod1;
    }
}