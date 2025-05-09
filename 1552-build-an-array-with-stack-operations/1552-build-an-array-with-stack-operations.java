class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> nums = new HashSet<>();
        for(int i: target){
            set.add(i);
        }
        for(int i = 1; i <= n; i++){
            if(set.contains(i)){
                ans.add("Push");
                nums.add(i);
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
            if(set.equals(nums)) return ans;
        }
        return ans;
    }
}