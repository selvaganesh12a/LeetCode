class Solution {
    HashSet<String> ans = new HashSet<>();
    public int numTilePossibilities(String tiles) {
        char[] c = tiles.toCharArray();
        Arrays.sort(c);
        solve(c,0,new StringBuilder());
        return ans.size() - 1;
    }

    private void solve(char[] c,int st, StringBuilder sb){
        if(st >= c.length){
            if(!ans.contains(sb.toString())){
                ans.add(sb.toString());
                return;
            }else{
                return;
            }
        }

        for(int i = 0; i <= sb.length(); i++){
            solve(c,st+1,sb.insert(i,c[st]));
            sb.deleteCharAt(i);
        }
        solve(c,st+1,sb);
    }
}