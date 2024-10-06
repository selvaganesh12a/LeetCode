class Solution {
    public static int[][] largestLocal(int[][] mat) {
        int n = mat.length;
        int ans[][] = new int[n-2][n-2];
        
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = max(mat, i, j);
            }
        }

        return ans; 
    }

    static int max(int[][] mat, int r,int c){
        int locmax = mat[r][c];

        for (int i = r; i < r+3; i++) {
            for (int j = c; j < c+3; j++) {
                if(locmax < mat[i][j]){
                    locmax = mat[i][j];
                }   
            }
        }

        return locmax;
    }
}