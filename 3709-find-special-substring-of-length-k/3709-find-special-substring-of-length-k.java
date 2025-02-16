class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int n = s.length();
        
        for (int i = 0; i <= n - k; i++) {
            String substring = s.substring(i, i + k);
            
            if (isAllSame(substring)) {
                char charInSubstring = substring.charAt(0);
                
                if (i > 0 && s.charAt(i - 1) == charInSubstring) {
                    continue;
                }
                
                if (i + k < n && s.charAt(i + k) == charInSubstring) {
                    continue;
                }
                
                return true;
            }
        }
        
        return false;
    }
    
    private static boolean isAllSame(String substring) {
        char firstChar = substring.charAt(0);
        for (char c : substring.toCharArray()) {
            if (c != firstChar) {
                return false;
            }
        }
        return true;
    }
}