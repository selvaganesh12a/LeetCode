class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        int v = 0, con = 0, s = 0, d = 0;
        for(char c: word.toCharArray()){
            if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') v++;
            else if((c > 'a' && c <= 'z') || (c > 'A' && c <= 'Z')) con++;
            else if(c >= '0' && c <= '9') d++;
            else s++;
        }

        if(v == 0 || con == 0) return false;
        if(s > 0) return false;

        return true;
    }
}