class Solution {
    public int[] processQueries(int[] queries, int m) {
        int n = queries.length;
        int[] ans = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            list.add(i);
        }
        int idx = 0;
        for(int i : queries){
            int val = list.indexOf(i);
            ans[idx++] = val;
            list.remove(Integer.valueOf(i));
            list.add(0,i);
        }
        return ans;
    }
}