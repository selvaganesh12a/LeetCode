class Solution {
    public int subarraySum(int[] nums) {
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            
            for(int j = Math.max(0,i - nums[i]); j <= i; j++){
                sum += nums[j];
            }
            list.add(sum);
        }
        for(int i = 0; i < list.size(); i++){
            ans += list.get(i);
        }
        return ans;
    }
}