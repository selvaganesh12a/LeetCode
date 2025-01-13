class Solution {
    public int minimumLength(String s) {
        int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) >= 3)
                map.put(s.charAt(i), map.get(s.charAt(i)) - 2);
        }
        Object[] temp = map.values().toArray();
        int[] temp1 = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            temp1[i] = (int) temp[i];
        }
        for (int i = 0; i < temp1.length; i++) {
            ans += temp1[i];
        }
        return ans;
    }
}