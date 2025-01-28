class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                rev += s.charAt(i);
            }
        }
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                temp += s.charAt(i);
            }
        }
        if(temp.equals(rev)){
            return  true;
        }else{
            return false;
        }
    }
}