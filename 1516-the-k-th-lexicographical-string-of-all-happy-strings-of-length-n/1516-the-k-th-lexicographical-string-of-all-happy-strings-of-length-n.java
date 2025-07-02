class Solution {
    ArrayList<String> ans = new ArrayList<>();
    public String getHappyString(int n, int k) {
        solve(n,new StringBuilder("a"));
        solve(n,new StringBuilder("b"));
        solve(n,new StringBuilder("c"));
        if(k > ans.size()) return "";
        return ans.get(k - 1);
    }

    private void solve(int n, StringBuilder sb){
        if(sb.length() == n) {
            ans.add(sb.toString());
            return;
        }

        if(sb.charAt(sb.length() - 1) == 'a'){
            solve(n,sb.append("b"));
            sb.deleteCharAt(sb.length() - 1);
            solve(n,sb.append("c"));
            sb.deleteCharAt(sb.length() - 1);
        }else if(sb.charAt(sb.length() - 1) == 'b'){
            solve(n,sb.append("a"));
            sb.deleteCharAt(sb.length() - 1);
            solve(n,sb.append("c"));
            sb.deleteCharAt(sb.length() - 1);
        }else if(sb.charAt(sb.length() - 1) == 'c'){
            solve(n,sb.append("a"));
            sb.deleteCharAt(sb.length() - 1);
            solve(n,sb.append("b"));
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}