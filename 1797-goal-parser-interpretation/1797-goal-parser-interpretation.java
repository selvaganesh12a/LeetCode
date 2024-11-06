class Solution {
    public String interpret(String command) {
        char c = '0';
        String ans = "";
        for (int i = 0; i < command.length(); i++) {
            c = command.charAt(i);
            if(c == 'G'){
                ans += 'G';
            }else if( c == '(' && ')' == command.charAt(i + 1)){
                ans += 'o';
            }else if(c == 'a'){
                ans += "al";
            }
        }
        return ans;
    }
}