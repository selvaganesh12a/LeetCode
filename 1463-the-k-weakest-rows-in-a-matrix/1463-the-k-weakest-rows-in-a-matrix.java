class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        int m = mat.length, n = mat[0].length;
        int[] temp = new int[m];
        Queue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < m; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 1) sum++;
            }
            temp[i] = sum;
            pq.add(sum);
        }

        int idx = 0;
        while(idx < k && !pq.isEmpty()){
            int val = pq.poll();
            for(int i = 0; i < m; i++){
                if(val == temp[i]){
                    ans[idx++] = i;
                    temp[i] = -1;
                    break;
                }
            }
        }
        return ans;
    }
}