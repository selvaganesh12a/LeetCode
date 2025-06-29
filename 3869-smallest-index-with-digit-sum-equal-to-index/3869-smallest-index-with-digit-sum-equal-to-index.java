class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int a = nums[i];
            int temp = 0;
            while(a > 0){
                temp += a%10;
                a /= 10;
            }
            if(temp == i) return i;
        }
        return -1;
    }
}