class Solution {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int[] temp = new int[mat.length*mat[0].length];

        if(r*c == mat.length*mat[0].length) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    temp[mat[0].length * i + j] = mat[i][j];
                }
            }

            for (int i = 0; i < temp.length; i++) {
                ans[i / ans[0].length][i % ans[0].length] = temp[i];
            }
        }else{
            return mat;
        }

        return ans;
    }
}