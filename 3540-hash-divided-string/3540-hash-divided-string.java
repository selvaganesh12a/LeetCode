class Solution {
    public String stringHash(String s, int k) {
        StringBuilder ans = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < 26; i++){
            map.put((char)('a'+ i), i);
        }
        int st = 0;
        while(st < s.length()){
            String temp = s.substring(st,st+k);
            int sum = 0;
            for(char c : temp.toCharArray()){
                sum += map.get(c);
            }
            ans.append((char)('a' + (sum % 26)));
            st += k;
        }
        return ans.toString();
    }
}