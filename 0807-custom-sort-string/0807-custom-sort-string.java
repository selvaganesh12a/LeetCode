class Solution {
    public String customSortString(String order, String s) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        HashMap<Character,Integer> map1 = new HashMap<>();
        for (char c : order.toCharArray()) {
            map1.put(c,map1.getOrDefault(c,0) + 1);
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            map2.put(c,map2.getOrDefault(c,0) + 1);
        }
        for (i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            if(s.contains(String.valueOf(c))){
                for (int j = 0; j < map2.get(c); j++) {
                    ans.append(c);
                }
            }else{
                break;
            }
        }
        if(map1.values().size() != map2.values().size()){
            for(int j = 0; j < s.length(); j++){
                if(!order.contains(String.valueOf(s.charAt(j)))){
                    ans.append(s.charAt(j));
                }
            }
        }
        return ans.toString();
    }
}