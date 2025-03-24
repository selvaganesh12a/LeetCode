class Solution {
    public int countKeyChanges(String s) {
        int ans = 0;
        for(int i = 0; i < s.length() - 1; i++){
            String a = String.valueOf(s.charAt(i));
            String b = String.valueOf(s.charAt(i+1));
            if(!a.equalsIgnoreCase(b)) ans++;
        }
        return ans;
    }
}