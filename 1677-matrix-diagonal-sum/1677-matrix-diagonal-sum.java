class Solution {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int a = 0;
        int b = mat.length-1;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i]. length; j++){
                if(i==j){
                    sum += mat[i][j];
                }else{
                    while(a <= mat.length - 1 && b >= 0){
                        if(a==b){
                            a += 1;
                            b -= 1;
                            continue;
                        }
                        sum += mat[a][b];
                        a += 1;
                        b -= 1;
                    }
                }
            }
        }
        return sum;
    }
}