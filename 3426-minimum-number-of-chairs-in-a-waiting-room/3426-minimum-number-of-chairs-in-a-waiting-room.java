class Solution {
    public int minimumChairs(String s) {
        int c = 0, p = 0;
        for(int i = 0; i < s.length(); i++){
            char e = s.charAt(i);
            if(e == 'E' && c == 0){
                c++;
                p++;
            }else if(e == 'E' && c >= p+1){
                p++;
            }else if(e == 'E' && c < p+1){
                c++;
                p++;
            }
            if(e == 'L'){
                p--;
            }
        }
        return c;
    }
}