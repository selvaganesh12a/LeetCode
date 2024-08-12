class Solution {
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans;
        if(m == n){
            ans = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    ans[i][j] = matrix[j][i];
                }
            }
        }else{
            ans = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ans[i][j] = matrix[j][i];
                }
            }
        }
        return ans;
    }
}