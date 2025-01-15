class Solution {
    public int reverse(int x) {
        long ans = 0;
        int temp = x;
        int len = 0;
        while(temp != 0){
            len++;
            temp /= 10;
        }
        if(len>10) return 0;
        while(x != 0){
            int dig = x % 10;
            if(((ans*10) + dig < 2147483647) && ((ans*10) + dig > -2147483647)){
                ans = (ans*10) + dig;
                x /= 10;
            }else{
                return 0;
            }
        }
        return (int)ans;
    }
}