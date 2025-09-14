class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        return solve(grid);
    }

    public int solve(int[][] grid){
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = 1;

        for(int i = 1; i < grid[0].length; i++){
            dp[0][i] = dp[0][i-1];
        }

        for(int i = 1; i < grid.length; i++){
            dp[i][0] =  dp[i-1][0];
        }

        for(int i = 1;i < grid.length; i++){
            for(int j = 1;j < grid[i].length; j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        
        return dp[grid.length - 1][grid[0].length - 1];
    }
}