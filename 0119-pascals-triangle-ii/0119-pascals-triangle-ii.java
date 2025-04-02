class Solution {
    public List<Integer> getRow(int n) {
        n = n+1;
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(List.of(1));
        if(n == 1) return ans.get(0);
        ans.add(List.of(1,1));
        for (int i = 3; i <= n; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i - 1; j++) {
                temp.add(ans.get(i-2).get(j-1) + ans.get(i-2).get(j));
            }
            temp.add(1);
            ans.add(temp);
        }
        if(n > 0) return ans.get(n - 1);
        return ans.get(0);
    }
}