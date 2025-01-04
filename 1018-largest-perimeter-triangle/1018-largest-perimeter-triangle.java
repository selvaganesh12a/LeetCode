class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int perimeter = 0;
        for (int i = 0; i < nums.length-2; i++) {
            if(nums[i] < (nums[i+1] + nums[i+2]) && nums[i+1] < (nums[i] + nums[i+2]) && nums[i+2] < (nums[i] + nums[i+1])){
                perimeter = nums[i] + nums[i+1] + nums[i+2];
                if(perimeter > ans){
                    ans = perimeter;
                }
            }
        }
        return ans;
    }
}