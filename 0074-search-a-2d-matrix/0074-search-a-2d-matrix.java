class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int s = 0;
        int e = row - 1;
        int m;
        while(s <= e){
            m = (s + e) / 2;
            if(matrix[m][0] <= target && matrix[m][col - 1] >= target){
                break;
            } else if (matrix[m][0] > target) {
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        int r = (s+e) / 2;
        s = 0;
        e = col - 1;
        while(s <= e){
            m = (s + e) /2;
            if(matrix[r][m] == target){
                return true;
            } else if (matrix[r][m] > target) {
                e = m - 1;
            }else {
                s = m + 1;
            }
        }
        return false;
    }
}