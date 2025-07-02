class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        solve(1,n,k,new ArrayList<>());
        return ans;
    }

    private void solve(int st,int e,int k,ArrayList<Integer> list){
        if(list.size() == k){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = st; i <= e; i++){
            list.add(i);
            solve(i+1,e,k,list);
            list.removeLast();
        }
    }
}