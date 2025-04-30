class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, s = 0, e = n - 1, ans = 0;
        while(s < e){
            ans = Math.max(ans,(nums[s] + nums[e]));
            s++;
            e--;
        }
        return ans;
    }
}