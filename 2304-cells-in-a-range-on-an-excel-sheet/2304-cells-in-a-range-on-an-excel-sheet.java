class Solution {
    public List<String> cellsInRange(String s) {
        ArrayList<String> ans = new ArrayList<>();
        int st = s.charAt(1) - '0';
        char start = s.charAt(0);
        int e = s.charAt(4) - '0';
        char end = s.charAt(3);
        int num = st;
        char temp = start;
        while(temp <= end){
            for(int i = st; i <= e; i++){
                ans.add(temp+String.valueOf(i));
            }
            temp += 1;
        }
        return ans;
    }
}