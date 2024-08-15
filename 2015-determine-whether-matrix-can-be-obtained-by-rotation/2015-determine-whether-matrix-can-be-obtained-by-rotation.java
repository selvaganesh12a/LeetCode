class Solution {
    public static boolean findRotation(int[][] mat, int[][] target) {
        int a = 0;
        int b = 0;
        int z = 0;
        int count = 0;
        boolean flag = false;

        if(mat.length == 1){
            if(mat[0][0] == target[0][0]){
                return true;
            }else{
                return false;
            }
        }

        int[][] temp = new int[mat.length][mat[0].length];

        while(z <= 3){
        for (int i = 0; i < mat[0].length; i++,a++) {
            for (int j = mat.length - 1; j >= 0; j--,b++) {
                temp[a][b] = mat[j][i];
            }
            b = 0;
        }

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if(temp[i][j] != target[i][j]){
                        flag = false;
                        break;
                    }else{
                        count += 1;
                    }
                }
            }

            if(count == mat.length * mat[0].length){
                return true;
            }else{
                count = 0;
            }

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    mat[i][j] = temp[i][j];
                }
            }

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    temp[i][j] = 0;
                }
            }

        a = 0;
        z += 1;
        }

        return flag;
    }
}