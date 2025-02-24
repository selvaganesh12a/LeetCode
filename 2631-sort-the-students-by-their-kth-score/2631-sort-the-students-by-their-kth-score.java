class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int m = score.length;
        int n = score[0].length;
        int[][] ans = new int[m][n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(j == k){
                    list.add(score[i][j]);
                }
            }
        }
        Collections.sort(list,(a,b) -> b.compareTo(a));
        int idx = 0;
        for(int i: list){
            for(int j = 0; j < m; j++){
                if(score[j][k] == i){
                    ans[idx++] = score[j];
                }
            }
        }
        return ans;
    }
}