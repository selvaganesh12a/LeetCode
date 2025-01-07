class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> group = new HashMap<>();
        int i;
        for(String s: strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String key = String.valueOf(temp);
            if(group.containsKey(key)){
                group.get(key).add(s);
            }else{
                group.put(key,new ArrayList<>());
                group.get(key).add(s);
            }
        }
        return new ArrayList<>(group.values());
    }
}