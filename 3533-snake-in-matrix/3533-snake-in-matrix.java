class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] grid = new int[n][n];
        int val = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = val++;
            }
        }
        int[] pos = new int[2];
        for(String i: commands){
            if(i.equals("RIGHT")) pos[1] += 1;
            else if(i.equals("LEFT")) pos[1] -= 1;
            else if(i.equals("UP")) pos[0] -= 1;
            else pos[0] += 1;
        }
        return grid[pos[0]][pos[1]];
    }
}