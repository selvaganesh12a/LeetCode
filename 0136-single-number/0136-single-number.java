class Solution {
    public int singleNumber(int[] nums) {
        int count = 1;
        Arrays.sort(nums);
        int temp = nums[0];
        int i = 0;

        for (i = 0; i < nums.length; i++) {
            if(i < nums.length - 1){
                if(temp == nums[i+1]){
                    count += 1;
                }
            }
            if(i < nums.length - 2){
                if(count == 2){ 
                    temp = nums[i+2];
                    i += 1;
                    count = 1;
                }else{
                    break;
                }
            }
        }if(i == nums.length){
            return nums[i - 1];
        }else{
            return nums[i];
        }
    }
}