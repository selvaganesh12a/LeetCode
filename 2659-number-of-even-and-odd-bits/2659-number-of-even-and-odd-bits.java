class Solution {
    public int[] evenOddBit(int n) {
        int[] ans = new int[2];
        int pos = 0;
        while(n != 0){
            if((pos&1) == 0 && (n&1) == 1) ans[0]++;
            else if((pos&1) == 1 && (n&1) == 1) ans[1]++;
            pos++;
            n = n>>1;
        }
        return ans;
    }
}