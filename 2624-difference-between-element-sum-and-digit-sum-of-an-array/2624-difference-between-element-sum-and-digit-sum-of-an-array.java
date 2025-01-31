class Solution {
    public int differenceOfSum(int[] nums) {
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int digsum = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            while(temp != 0){
                digsum += temp%10;
                temp /= 10;
            }
        }
        return Math.abs(sum - digsum);
    }
}