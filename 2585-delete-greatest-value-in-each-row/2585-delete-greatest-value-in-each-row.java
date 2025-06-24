class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans = 0, m = grid.length, n = grid[0].length, count = m*n;
        while(count > 0){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < m; i++){
                Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
                for(int j = 0; j < n; j++){
                    if(grid[i][j] != 0) pq.add(grid[i][j]);
                }
                int del = pq.poll();
                list.add(del);
                for(int j = 0; j < n; j++){
                    if(del == grid[i][j]){ 
                        grid[i][j] = 0;
                        count -= 1;
                        break;
                    }
                }
            }
            int max = 0;
            for(int i: list) max = Math.max(max,i);
            ans += max; 
        }
        return ans;
    }
}