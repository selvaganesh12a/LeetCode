class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        solve(1,k, 0, n, new ArrayList<>());
        return ans;
    }
    public void solve(int st,int k ,int sum,int target, ArrayList<Integer> list){
        if(list.size() == k && sum == target){
            ans.add(new ArrayList<>(list));
            return;
        }

        if(sum > target) return;

        for (int i = st; i <= 9; i++) {
            list.add(i);
            solve(i+1,k,sum+i,target,list);
            list.removeLast();
        }
    }
}