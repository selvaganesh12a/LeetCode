class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(candidates,0,0,0,target,new ArrayList<>());
        return ans;
    }
    public void solve(int[] nums,int st,int val, int sum, int target, ArrayList<Integer> list){
        if(val > 0){
            sum += val;
            list.add(val);
        }

        if(sum == target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum > target) return;

        for(int i = st; i < nums.length; i++){
            solve(nums,i,nums[i],sum,target,list);
            list.removeLast();
        }
    }
}