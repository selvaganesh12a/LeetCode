class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0)
                neg.add(nums[i]);
            else
                pos.add(nums[i]);
        }
        int[] ans = new int[nums.length];
        int idx1 = 0;
        int idx2 = 0;
        for (int i = 0; i < ans.length; i++) {
            if(i % 2 == 0){
                ans[i] = pos.get(idx1);
                idx1++;
            }
            else {
                ans[i] = neg.get(idx2);
                idx2++;
            }
        }
        return ans;
    }
}