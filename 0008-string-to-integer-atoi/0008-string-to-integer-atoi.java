class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int n = s.length();
        if(n == 0){
            return 0;
        }
        if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z'){
            return 0;
        }
        long ans = 0;
        if(s.charAt(0) != '-' && s.charAt(0) != '+'){
            for(int i = 0; i < n; i++){
                if(ans < Integer.MAX_VALUE && s.charAt(i) >= '0' && s.charAt(i) <= '9') ans = (ans*10) + Integer.parseInt(String.valueOf(s.charAt(i)));
                else if((ans >= Integer.MAX_VALUE)) return Integer.MAX_VALUE;
                else break;
            }
            if(ans > Integer.MAX_VALUE){
                ans = Integer.MAX_VALUE;
            }
            return (int)ans;
        }else if(s.charAt(0) == '+'){
            for(int i = 1; i < n; i++){
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9') ans = (ans*10) + Integer.parseInt(String.valueOf(s.charAt(i)));
                else break;
            }
            if(ans > Integer.MAX_VALUE){
                ans = Integer.MAX_VALUE;
            }
            return (int)ans;
        }
        else{
            for(int i = 1; i < n; i++){
                if(ans < Integer.MAX_VALUE && s.charAt(i) >= '0' && s.charAt(i) <= '9') ans = (ans*10) + Integer.parseInt(String.valueOf(s.charAt(i)));
                else break;
            }
            if(ans*-1 <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            return (int)ans*-1;
        }
    }
}