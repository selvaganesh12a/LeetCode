class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        for(String i: logs){
            if(!st.empty() && i.equals("../")){
                st.pop();
            }else if(i.equals("./")){
                continue;
            }else if(!i.equals("../") && !i.equals("./")) st.push(i);
        }
        return st.size();
    }
}