class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String ans = "";
        int count = 1;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(Integer.parseInt(String.valueOf(words[j].charAt(words[j].length() - 1))) == count){
                    ans += words[j].substring(0, words[j].length() - 1)+" ";
                    count += 1;
                }                
            }
        }
        return ans.trim();
    }
}