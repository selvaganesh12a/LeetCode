class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int count = 0;
        for (int value : map.values()) {
            if(value % 2 == 1) count += 1;
        }
        if(count > k) return false;
        else return true;
    }
}