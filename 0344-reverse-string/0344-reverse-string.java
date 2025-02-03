class Solution {
    public void reverseString(char[] s) {
        int st = 0;
        int e = s.length - 1; 
        for(int i = 0; i < s.length / 2; i++){
            char temp = s[st];
            s[st] = s[e];
            s[e] = temp;
            st++;
            e--;
        }
    }
}