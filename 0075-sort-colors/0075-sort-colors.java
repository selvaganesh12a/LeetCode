class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                count[0] += 1;
            else if (nums[i] == 1)
                count[1] += 1;
            else
                count[2] += 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(count[0] != 0){
                nums[i] = 0;
                count[0] -= 1;
            }else if(count[1] != 0){
                nums[i] = 1;
                count[1] -= 1;
            }else{
                nums[i] = 2;
            }
        }
    }
}