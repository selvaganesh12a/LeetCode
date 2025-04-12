class Solution {
    public int minOperations(int n) {
        int ans = 0, sum = 0, c = 0, s = 0, e = n - 1;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = (2 * i) + 1;
            sum += nums[i];
        }
        int target = sum / n;
        for (int i : nums) if(i != target) c++;
        while(c != 0){
            if(nums[e] > 0 && nums[e] != target){
                nums[e] -= 1;
                nums[s] += 1;
                ans++;
            }
            if(nums[e] == target){
                c-=2;
                s++;
                e--;
            }
        }
        return ans;
    }
}