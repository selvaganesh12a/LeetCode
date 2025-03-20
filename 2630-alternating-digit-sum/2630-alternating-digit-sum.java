class Solution {
    public int alternateDigitSum(int n) {
        int pv = 1, ans = 0, temp = n, dig = 0;
        while(temp >= 10){
            pv *= 10;
            temp /= 10;
        }
        while(pv != 0){
            dig++;
            if((dig&1) == 1){
                ans += (n / pv) % 10;
            }else{
                ans -= (n / pv) % 10;
            }
            pv /= 10;
        }
        return ans;
    }
}