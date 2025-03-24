class Solution {
    public int countKeyChanges(String s) {
        int ans = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length() - 1; i++){
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            if(a != b) ans++;
        }
        return ans;
    }
}