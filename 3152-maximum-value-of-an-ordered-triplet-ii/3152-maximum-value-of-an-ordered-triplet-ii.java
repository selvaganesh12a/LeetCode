class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        int n = nums.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        pref[0] = nums[0];
        for(int i = 1; i < n; i++){
            pref[i] = Math.max(pref[i-1],nums[i]);
        }
        suff[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--){
            suff[i] = Math.max(suff[i+1],nums[i]);
        }
        for(int i = 1; i < n-1; i++){
            long a = pref[i - 1];
            long b = nums[i];
            long c = suff[i + 1];
            ans = Math.max(ans, ((a - b) * c));
        }
        return ans;
    }
}