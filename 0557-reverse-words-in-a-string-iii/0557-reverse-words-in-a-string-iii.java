class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String ans = "";
        for (int i = 0; i < words.length; i++) {
            StringBuilder temp = new StringBuilder(words[i]);
            ans += temp.reverse();
            if(i < words.length - 1){
                ans += " ";
            }
        }
        return ans;
    }
}