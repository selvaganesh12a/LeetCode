class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length == 1) return 0;
        int n = nums.length, s = nums.length - k, e = nums.length - 1, ans = Integer.MAX_VALUE;
        while(s >= 0){
            if(ans > nums[e] - nums[s]) ans = nums[e] - nums[s];
            s--;
            e--;
        }
        return ans;
    }
}