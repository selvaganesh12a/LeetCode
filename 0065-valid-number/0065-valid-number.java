class Solution {
    public boolean isNumber(String s) {
        boolean num = false;
        boolean sign = false;
        boolean exp = false;
        boolean dot = false;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if(ch >= 48 && ch <= 57){
                num = true;
            }else if(ch == '.'){
                if(exp == true || dot == true)
                    return false;
                else
                    dot = true;
            }else if(ch == 'e' || ch == 'E'){
                if(exp == true || num == false)
                    return false;
                else{
                    exp = true;
                    sign = false;
                    num = false;
                    dot = false;
                }
            }else if(ch == '+' || ch == '-'){
                if(sign == true || num == true || dot == true){
                    return false;
                }else
                    sign = true;
            }else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                return false;
            }else
                return true;
        }
        if(s.charAt(s.length() - 1) >= '0' || s.charAt(s.length() - 1) <= '9')
            return num;
        else if (s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-')
            return false;
        else if (s.charAt(s.length() - 1) == 'e' || s.charAt(s.length() - 1) == 'E')
            return false;
        else if ((s.charAt(s.length() - 1) >= 'a' && s.charAt(s.length() - 1) <= 'z') || (s.charAt(s.length() - 1) >= 'A' && s.charAt(s.length() - 1) <= 'Z'))
            return false;
        else
            return false;
    }
}