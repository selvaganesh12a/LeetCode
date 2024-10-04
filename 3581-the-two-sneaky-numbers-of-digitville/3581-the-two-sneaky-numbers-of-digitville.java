class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        int count = 1;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                temp.add(nums[i]);
            }
        }
        
        int[] ans = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            ans[i] = temp.get(i);
        }

        return ans;
    }
}