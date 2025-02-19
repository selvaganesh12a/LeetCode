class Solution {
    public int longestPalindrome(String s) {
        int[] chars = new int[256];
        for(char c: s.toCharArray()){
            chars[c]++;
        }
        int ans =0;
        for(int i: chars){
            ans += i/2*2;
        }
        if(ans < s.length()){
            ans++;
        }
        return ans;
    }
}