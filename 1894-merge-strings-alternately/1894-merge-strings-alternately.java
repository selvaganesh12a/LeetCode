class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder ans = new StringBuilder();
       if(word1.length() == word2.length()){
        for(int i = 0; i < word1.length(); i++){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }
       }else if(word1.length() > word2.length()){
        int i = 0;
        for(i = 0; i < word2.length(); i++){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }
        while(i < word1.length()){
            ans.append(word1.charAt(i));
            i++;
        }
       }else {
        int i = 0;
        for(i = 0; i < word1.length(); i++){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }
        while(i < word2.length()){
            ans.append(word2.charAt(i));
            i++;
        }
       }
       return ans.toString(); 
    }
}