class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int t = 0;
        int b = ans.length - 1;
        int l = 0;
        int r = ans[0].length - 1;
        int val = 1;
        while(t <= b && l <= r){
            for (int i = l; i <= r; i++) {
                ans[t][i] = val++;
            }
            t++;
            for (int i = t; i <= b; i++) {
                ans[i][r] = val++;
            }
            r--;
            if(t <= b){
                for (int i = r; i >= l ; i--) {
                    ans[b][i] = val++;
                }
                b--;
            }
            if(l <= r){
                for (int i = b; i >= t; i--) {
                    ans[i][l] = val++;
                }
                l++;
            }
        }
        return ans;
    }
}