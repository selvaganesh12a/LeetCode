class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int n = grid.length;
        int[] count = new int[(n*n)+1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                count[grid[i][j]]++;
            }
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] > 1) ans[0] = i;
            if(count[i] == 0) ans[1] = i;
        }
        return ans;
    }
}