class Solution {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int minRow = 0;
        int maxCol = 0;
        int lucky = 0;
        for (int i = 0; i < matrix.length; i++) {
            minRow =  minimum(matrix[i]);
            maxCol = maximum(matrix,minRow,i);
            if(maxCol != -1 ){
                ans.add(matrix[i][minRow]);
            }
        }
        return ans;
    }

    static int  minimum(int[] mat){
        int min = mat[0];
        int index = 0;
        for (int i = 1; i < mat.length; i++) {
            if(min > mat[i]){
                min = mat[i];
                index = i;
            }
        }
        return index;
    }

    static int maximum(int[][] mat,int minRow,int i){
        int j ;
        int max = mat[i][minRow];
        for (j = 0; j < mat.length; j++) {
            if(max < mat[j][minRow]){
                return -1;
            }
        }
        return j-1;
    }
}