class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int num = nums[i], temp = nums[i], pv = 1;
            while(temp >= 10){
                pv *= 10;
                temp /= 10;
            }
            while(pv != 0){
                list.add((num/pv)%10);
                pv /= 10;
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}