class Solution {
    public boolean check(int[] nums) {
        int pivot = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1]) {
                pivot = i+1;
                break;
            }
        }
        int[] b = new int[nums.length];
        boolean ans = true;
        for (int i = 0; i < nums.length; i++) {
            b[i] = nums[(i+pivot) % nums.length];
        }
        for (int i = 0; i < b.length -  1; i++) {
            if(b[i] > b[i+1]){
                return false;
            }
        }
        return ans;
    }
}