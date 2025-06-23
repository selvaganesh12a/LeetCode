class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        String[] words = path.split("/");
        Stack<String> st = new Stack<>();
        for(String i: words){
            if(i.equals("") || i.equals(".")) continue;
            else if(i.equals("..")){
                if(!st.empty()) st.pop();
            }
            else st.push(i);
        }
        for(String i: st){
            sb.append("/").append(i);
        }
        if(sb.length() == 0) return "/";
        return sb.toString();
    }
}