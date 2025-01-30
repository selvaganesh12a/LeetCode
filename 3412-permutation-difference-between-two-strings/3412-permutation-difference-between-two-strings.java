class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> smap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            smap.put(s.charAt(i),i);
        }
        HashMap<Character,Integer> tmap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tmap.put(t.charAt(i),i);
        }
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char f = s.charAt(i);
            int fn = smap.get(f);
            int sn = tmap.get(f);
            ans += Math.abs(fn-sn);
        }
        return ans;
    }
}