class Solution {
    public int mySqrt(int x) {
        int ans = 0;
        int sub = 1;
        int temp = 0;

        while(x - sub >= 0){
            temp = x - sub;
            x = temp;
            sub += 2;
            ans += 1;
        }

        return ans;    
    }
}