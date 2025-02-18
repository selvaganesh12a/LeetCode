class Solution {
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for(int i = 0; i < nums.size(); i++){
            if(number(i) == k){
                ans+=nums.get(i);
            }
        }
        return ans;
    }
    public static int number(int n){
        int c = 0;
        while(n != 0){
            if((n&1) == 1){
                c++;
            }
            n = n>>1;
        }
        return c;
    }
}