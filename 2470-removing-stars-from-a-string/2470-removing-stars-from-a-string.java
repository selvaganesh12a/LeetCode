class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int skip = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '*'){
                skip++;
            }else{
                if(skip > 0){
                    skip--;
                }else{
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.reverse().toString();
    }
}