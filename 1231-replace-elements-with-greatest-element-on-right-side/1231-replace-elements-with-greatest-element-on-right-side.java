class Solution {
    public int[] replaceElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[n - 1] = -1;
        int max = Integer.MIN_VALUE, idx = 0;

        for(int i = 0; i < n - 1; i++){
            if(i >= idx){
                max = Integer.MIN_VALUE;
                for(int j = n - 1; j > i; j--){
                    if(nums[j] > max){
                        max = nums[j];
                        idx = j;
                    }
                }
                ans[i] = max;
            }else{
                ans[i] = max;
            }
        }
        return ans;
    }
}