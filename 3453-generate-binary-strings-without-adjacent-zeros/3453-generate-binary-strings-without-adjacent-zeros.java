class Solution {
     ArrayList<String> ans = new ArrayList<>();
    public  List<String> validStrings(int n) {
        solve("0",n,new StringBuilder("0"));
        solve("1",n,new StringBuilder("1"));
        return ans;
    }
    private  void solve(String st,int n,StringBuilder sb){
        if(sb.length() == n){
            ans.add(sb.toString());
            return;
        }
        if(sb.charAt(sb.length() - 1) == '1'){
            solve(st,n,sb.append('0'));
            sb.deleteCharAt(sb.length() - 1);
            solve(st,n,sb.append('1'));
            sb.deleteCharAt(sb.length() - 1);
        }else{
            solve(st,n,sb.append('1'));
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}