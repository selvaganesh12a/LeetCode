class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if((nums[i]&1) == 1) ans[i] = 1;
            else ans[i] = 0;
        }
        Arrays.sort(ans);
        return ans;
    }
}