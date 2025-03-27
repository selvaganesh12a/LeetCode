class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m][n];
        int[] onesrow = new int[m];
        int[] zeroesrow = new int[m];
        int[] onescol = new int[n];
        int[] zeroescol = new int[n];
        for (int i = 0; i < m; i++) {
            int one = 0;
            int zero = 0;
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 1) one++;
                else zero++;
            }
            onesrow[i] = one;
            zeroesrow[i] = zero;
        }
        for (int i = 0; i < n; i++) {
            int one = 0;
            int zero = 0;
            for (int j = 0; j < m; j++) {
                if(grid[j][i] == 1) one++;
                else zero++;
            }
            onescol[i] = one;
            zeroescol[i] = zero;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = onesrow[i] + onescol[j] - zeroesrow[i] - zeroescol[j];
            }
        }
        return ans;
    }
}