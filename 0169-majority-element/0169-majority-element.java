class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length / 2;
        Arrays.sort(nums);
        int count = 1;
        int i = 0;

        for (i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]){
                count += 1;
            }
            if(count > len){
                break;
            }
        }
        return nums[i];
    }
}