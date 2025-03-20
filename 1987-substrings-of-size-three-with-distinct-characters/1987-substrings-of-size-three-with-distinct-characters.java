class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        for(int i = 0; i <= n-3; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = i; j < i+3; j++){
                set.add(s.charAt(j));
            }
            if(set.size() == 3) ans++;
        }
        return ans;
    }
}