class Solution {
    public int strStr(String haystack, String needle) {
        int ans = -1;
        int len = needle.length();
        for (int i = 0; i <= haystack.length()-len; i++) {
            if(haystack.substring(i,i+len).equals(needle)){
                ans = i;
                break;
            }
        }
        return ans;
    }
}