class Solution {
    public int minOperations(int[] nums) {
        int s = 0, e = 2, n = nums.length, ans = 0;
        while(e < n){
            if(nums[s] == 0){
                for(int i = s; i <= e; i++){
                    nums[i] = 1 - nums[i];
                }
                ans++;
                s++;
                e++;
            }else{
                s++;
                e++;
            }
        }
        int c = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1) c++;
        }
        if(c == n) return ans;
        else return -1;
    }
}