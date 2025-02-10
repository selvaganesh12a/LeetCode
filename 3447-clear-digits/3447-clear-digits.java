class Solution {
    public String clearDigits(String s) {
        String ans = "";
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if(st.empty()){
                st.push(c);
            }else if(c >= 'a' && c <= 'z'){
                st.push(c);
            }else if(c >= '0' && c <= '9'){
                st.pop();
            }
        }
        for (char c: st) {
            ans  += c;
        }
        return ans;
    }
}