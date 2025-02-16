class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i + 1; j < nums.length; j++){
                sum += nums[j];
            }
            r[i] = sum;
        }
        for(int i = 1; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j < i; j++){
                sum += nums[j];
            }
            l[i] = sum;
        }
        for(int i = 0; i < nums.length; i++){
            ans[i] = Math.abs(l[i] - r[i]);
        }
        return ans;
    }
}