class Solution {
    public int minSteps(String s, String t) {
        int ans = 0;
        HashMap<Character,Integer> smap = new HashMap<>();
        for(char c : s.toCharArray()) smap.put(c,smap.getOrDefault(c,0) + 1);
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(char c : t.toCharArray()) tmap.put(c,tmap.getOrDefault(c,0) + 1);
        for(char c : smap.keySet()){
            if(smap.get(c) - tmap.getOrDefault(c,0) > 0) {
                ans += smap.get(c) - tmap.getOrDefault(c,0);
            }
        }
        return ans;
    }
}