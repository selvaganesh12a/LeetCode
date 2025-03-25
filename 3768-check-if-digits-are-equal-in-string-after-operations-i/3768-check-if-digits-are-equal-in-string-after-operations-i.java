class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.length() > 2){
            int len = sb.length();
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < len - 1; i++) {
                int a = sb.charAt(i) - '0';
                int b = sb.charAt(i+1) - '0';
                int c = (a + b) % 10;
                temp.append(c);
            }
            sb = temp;
        }
        if(sb.charAt(0) == sb.charAt(1)) return true;
        else return false;
    }
}