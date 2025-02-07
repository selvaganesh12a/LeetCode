class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int ans = 0;
        int noSub = 1<<nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < noSub; i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if((i & (1 << j)) != 0)
                    sub.add(nums[j]);
            }
            result.add(sub);
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max |= nums[i];
        }
        for (List<Integer> i: result) {
            int temp = 0;
            for (int j : i) {
                temp |= j;
            }
            if(temp == max){
                ans += 1;
            }
        }
        return ans;
    }
}