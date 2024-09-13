class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    temp.add(i);
                    temp.add(j);
                }
            }
        }

        for (int k = 0; k < temp.size(); k++) {
            if(k % 2 == 0){
                for (int i = 0; i < matrix[0].length; i++) {
                    matrix[temp.get(k)][i] = 0;
                }
            }else{
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][temp.get(k)] = 0;
                }
            }
        }
    }
}