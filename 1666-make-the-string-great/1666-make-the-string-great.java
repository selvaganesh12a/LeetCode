class Solution {
    public String makeGood(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.empty() && ((((char)(st.peek() - 32))) == c || ((char)(st.peek() + 32)) == c)){
                st.pop();
            }else st.push(c);
        }
        while(!st.empty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}