class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = 0, curr = 1;
        int n = prices.length;
        if(n == 1) return 1;
        for (int i = 1; i < n; i++) {
            if(prices[i-1] - prices[i] == 1) curr++;
            else{
                ans += (curr * (curr+1)) / 2;
                curr = 1;
            }
        }
        ans += (curr * (curr+1)) / 2;
        return ans;
    }
}