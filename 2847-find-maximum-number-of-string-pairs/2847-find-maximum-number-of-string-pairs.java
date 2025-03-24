class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans = 0;
        for(String f : words){
            for(String l : words){
                if(!f.equals(l) && f.charAt(1) == l.charAt(0) && f.charAt(0) == l.charAt(1)) ans++;
            }
        }
        return ans/2;
    }
}