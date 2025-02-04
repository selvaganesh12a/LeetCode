class Solution {
    public int minimumSum(int num) {
        int[] nums = new int[4];
        int i = 0;
        while(num != 0){
            int temp = num %10;
            nums[i] = temp;
            num /= 10;
            i++;
        }
        Arrays.sort(nums);
        int num1 = (nums[0]*10) + nums[2];
        int num2 = (nums[1]*10) + nums[3];
        return num1+num2;
    }
}