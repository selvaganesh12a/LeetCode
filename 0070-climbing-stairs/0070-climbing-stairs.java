class Solution {
    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int temp = 0;
        for(int i = 1; i <= n; i++){
            temp = a+b;
            a = b;
            b = temp;
        }
        return temp;
    }
}