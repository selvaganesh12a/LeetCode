class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()) return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int n = p.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : p.toCharArray()) map.put(c,map.getOrDefault(c,0) + 1);
        HashMap<Character,Integer> temp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            temp.put(s.charAt(i),temp.getOrDefault(s.charAt(i),0) + 1);
        }
        if (temp.equals(map)) {
            ans.add(0);
        }
        for(int i = 1; i <= s.length() - n; i++){
            char out = s.charAt(i - 1);
            char in = s.charAt(i + n - 1);
            temp.put(out,temp.get(out) - 1);
            if(temp.get(out) == 0) temp.remove(out);
            temp.put(in,temp.getOrDefault(in,0) + 1);
            if(map.equals(temp)) ans.add(i);
            }
        return ans;
    }
}