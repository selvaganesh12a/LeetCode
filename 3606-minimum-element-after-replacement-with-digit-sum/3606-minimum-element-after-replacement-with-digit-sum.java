class Solution {
    public int minElement(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int sum = 0;
            while(temp != 0){
                sum += temp % 10;
                temp /= 10;
            }
            nums[i] = sum;
        }
        ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(ans > nums[i])
                ans = nums[i];
        }
        return ans;
    }
}