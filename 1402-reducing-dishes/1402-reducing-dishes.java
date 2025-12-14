class Solution {
    public int maxSatisfaction(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int count = 0, time = 1;
            for(int j = i; j < n; j++){
                count += ((time++) * nums[j]);
            }
            arr[i] = count;
        }
        //System.out.println(Arrays.toString(arr));
        int ans = Integer.MIN_VALUE;
        for(int i: arr) ans = Math.max(ans,i);
        if(ans <= 0) return 0;
        else return ans;
    }
}