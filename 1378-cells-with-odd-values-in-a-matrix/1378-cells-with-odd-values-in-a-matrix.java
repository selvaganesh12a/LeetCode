class Solution {
        public static int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];

        for(int i = 0; i < indices.length; i++){
            for(int j = 0; j < 2; j++){
                if(j == 0) {
                    addnum(mat , indices[i][j] , true);
                }else{
                    addnum(mat , indices[i][j] , false);
                }
            }
        }
        return findOdd(mat);
    }

    private static int findOdd(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] % 2 == 1){
                    count += 1;
                }
            }
        }
        return count;
    }

    static void addnum(int[][] mat, int index,boolean flag) {
        if(flag == true) {
            for (int i = 0; i < mat[index].length; i++) {
                mat[index][i] += 1;
            }
        }else{
            for (int i = 0; i < mat.length; i++) {
                mat[i][index] += 1;
            }
        }
    }
}