class Solution {
    public int divide(int dividend, int divisor) {
        int ans = dividend/divisor;
        if(ans == -2147483648 && dividend < 0 && divisor < 0){
            return -1*ans-1;
        }
        return ans;
    }
}