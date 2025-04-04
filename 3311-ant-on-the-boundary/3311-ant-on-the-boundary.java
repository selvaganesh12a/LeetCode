class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int n = nums.length, ans = 0;
        int[] pref = new int[n];
        pref[0] = nums[0];
        for(int i = 1; i < n; i++){
            pref[i] = pref[i - 1] + nums[i];
        }
        int[] suff = new int[n];
        suff[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--){
            suff[i] = suff[i + 1] + nums[i];
        }
        for(int i = 0; i < n - 1; i++){
            if(pref[i] + nums[i+1] == 0) ans++;
        }
        return ans;
    }
}