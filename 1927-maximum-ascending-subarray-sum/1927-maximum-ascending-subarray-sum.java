class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int ans = 0;
        int sum = 0;
        int i=0;
        int j=0;
        for (i = j; i < nums.length; i=j) {
            if(i == nums.length - 1)
                break;
            for (j = i; j < nums.length; j++) {
                if(j != nums.length - 1 && nums[j] < nums[j+1])
                    sum += nums[j];
                if(j == nums.length - 1) {
                    sum += nums[j];
                    break;
                }
                if(nums[j] >= nums[j+1]) {
                    sum += nums[j];
                    j++;
                    break;
                }
                if(nums[j] == nums[j+1]){
                    sum = 0;
                }
            }
            if(sum > ans)
                ans = sum;
            sum = 0;
        }
        return ans;
    }
}