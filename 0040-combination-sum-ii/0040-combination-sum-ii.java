class Solution {
     List<List<Integer>> ans = new ArrayList<>();

    public  List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(candidates,0,0,target,new ArrayList<>());
        return ans;
    }

    private  void solve(int[] nums,int st, int sum, int target,ArrayList<Integer> list){
        
        if(sum == target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum > target) return;

        for(int i = st; i < nums.length; i++){
            if(i > st && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            solve(nums,i+1,sum+nums[i],target,list);
            list.removeLast();
        }
    }
}