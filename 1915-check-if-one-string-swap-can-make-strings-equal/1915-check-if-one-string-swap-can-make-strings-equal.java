class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        HashMap<Character,Integer> l = new HashMap<>();
        HashMap<Character,Integer> l1 = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            l.put(s1.charAt(i),l.getOrDefault(s1.charAt(i),0) + 1);
            l1.put(s2.charAt(i),l1.getOrDefault(s2.charAt(i),0) + 1);
        }
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(!l1.containsKey(c)){
                return false;
            }
            if(!l.containsKey(s2.charAt(i)))
                return false;
            if(l.get(s1.charAt(i)) != l1.get(s1.charAt(i)))
                return false;
        }
        int count = 0;
        for(int i = 0; i < s1.length(); i++){
            if(count > 2){
                return false;
            }
            if(s1.charAt(i) != s2.charAt(i)){
                count += 1;
            }
        }
        if(count > 2 || count == 1){
            return false;
        }
        return true;
    }
}