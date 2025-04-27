class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length,n = mat[0].length;
        int[][] ans = new int[m][n];
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int diff = i - j;
                if(!map.containsKey(diff)){
                    ArrayList<Integer> temp = new ArrayList<>();
                    map.put(diff,temp);
                }
                map.get(diff).add(mat[i][j]);
            }
        }

        for(int i : map.keySet()){
            Collections.sort(map.get(i));
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int diff = i - j;
                int val = map.get(diff).get(0);
                map.get(diff).remove(0);
                ans[i][j] = val;
            }
        }

        return ans;
    }
}