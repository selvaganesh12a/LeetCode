class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[((nums.length - (k%nums.length))+i)%nums.length];
        }
        for(int i = 0; i < ans.length; i++){
            nums[i] = ans[i];
        }
    }
}