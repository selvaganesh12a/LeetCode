class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            int[] r = new int[n+1];
            int[] c = new int[n+1];
            for(int j = 0; j < n; j++){
                r[matrix[i][j]]++;
                c[matrix[j][i]]++;
            }
            for(int k = 1; k < n; k++){
                if(r[k] > 1 || r[k] == 0){
                    return false;
                }
                if(c[k] > 1 || c[k] == 0){
                    return false;
                }
            }
        }
        return true;
    }
}