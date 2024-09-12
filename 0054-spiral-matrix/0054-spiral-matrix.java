class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = -1;
        int dr = 0;
        int dc = 1;
        return spiral(matrix, m , n, result, r, c, dr, dc);
    }

    static List<Integer> spiral(int[][] mat, int m, int n,List<Integer> res,int r,int c,int dr,int dc){
        if(m == 0 || n == 0){
            return res;
        }

        for(int i = 0; i < n; i++){
            r += dr;
            c += dc;
            res.add(mat[r][c]);
        }
        spiral(mat, n, m - 1, res, r, c, dc, -dr);
        return res;
    }
}