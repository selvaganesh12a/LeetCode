class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        int n = nums.length;
        for(int i = 0; i < n - 2; i++){
            for(int j = i+1; j < n - 1; j++){
                for(int k = j+1; k < n; k++){
                    long a = nums[i];
                    long b = nums[j];
                    long c = nums[k];
                    ans = Math.max((long)((a - b) * c),(long) ans);
                }
            }
        }
        return ans;
    }
}