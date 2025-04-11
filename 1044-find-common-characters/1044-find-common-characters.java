class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        ArrayList<HashMap<Character,Integer>> c = new ArrayList<>();
        for(String i : words){
            HashMap<Character, Integer> map = new HashMap<>();
            for(char ch : i.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0) + 1);
            }
            c.add(map);
        }
        for(char ch : words[0].toCharArray()){
            int count = 0;
            for(int i = 1; i < n; i++){
                if(c.get(i).getOrDefault(ch,0) > 0){
                    c.get(i).put(ch,c.get(i).get(ch) - 1);
                    count++;
                }
            }
            if(count == n - 1) ans.add(String.valueOf(ch));
        }
        return ans;
    }
}