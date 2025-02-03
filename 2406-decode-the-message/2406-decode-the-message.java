class Solution {
    public String decodeMessage(String key, String message) {
        String ans = "";
        HashMap<Character,Character> map  = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        for (char c : key.toCharArray()) {
            if(c != ' ' && !list.contains(c))
                list.add(c);
        }
        for (int i = 0; i < list.size(); i++) {
            if(!map.containsKey(list.get(i)))
                map.put(list.get(i),(char) ('a' + i));
        }
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == ' '){
                ans += ' ';
            }else{
                ans += map.get(message.charAt(i));
            }
        }
        return ans;
    }
}