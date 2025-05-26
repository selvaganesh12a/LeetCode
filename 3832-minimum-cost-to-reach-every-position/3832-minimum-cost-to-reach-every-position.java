class Solution {
    public int[] minCosts(int[] cost) {
        int min = Integer.MAX_VALUE,n = cost.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            int temp = cost[i];
            ans[i] = Math.min(temp,min);
            min = Math.min(temp,min);
        }
        return ans;
    }
}