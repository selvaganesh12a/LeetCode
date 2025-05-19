class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) map.put(c,map.getOrDefault(c,0) + 1);
        int vowels = 0, consonants = 0;
        for(char c : map.keySet()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels = Math.max(vowels,map.get(c));
            else consonants = Math.max(consonants,map.get(c));
        } 
        return vowels + consonants;
    }
}