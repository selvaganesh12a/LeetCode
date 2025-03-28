class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int n = nums.length;
        int len = queries.length;
        int[] ans = new int[len];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(nums[i] == x) list.add(i);
        }
        for (int i = 0; i < len; i++) {
            if(queries[i] <= list.size()) ans[i] = list.get(queries[i] - 1);
            else ans[i] = -1;
        }
        return ans;
    }
}