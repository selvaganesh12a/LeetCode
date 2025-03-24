class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int i = 0;
        for (i = 0; i < n/2; i++) {
            char f = s.charAt(i);
            char l = s.charAt(n - i - 1);
            if(f != l){
                if(f < l){
                    ans.insert(i,f);
                    ans.insert(i+1,f);
                }else{
                    ans.insert(i,l);
                    ans.insert(i+1,l);
                }
            }else{
                ans.insert(i,f);
                ans.insert(i+1,f);
            }
        }
        if(s.length()%2 == 1){
            ans.insert(i,s.charAt(i));
        }
        return ans.toString();
    }
}