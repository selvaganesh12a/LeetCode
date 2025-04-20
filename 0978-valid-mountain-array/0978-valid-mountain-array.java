class Solution {
    public boolean validMountainArray(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++) if(nums[i] == nums[i+1]) return false;
        int i = 0;
        while(i < n - 1){
            if(nums[i] > nums[i+1]) break;
            i++;
        }
        if(i == 0) return false;
        if(i == n - 1) return false;
        while(i < n - 1){
            if(nums[i] < nums[i+1]) return false;
            i++;
        }
        return true;
    }
}