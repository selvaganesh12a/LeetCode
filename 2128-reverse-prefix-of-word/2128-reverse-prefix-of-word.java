class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> s = new Stack<>();
        String ans = "";
        int i = 0;
        for (i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(s.isEmpty())
                s.push(c);
            else
                s.push(c);
            if(s.peek() == ch){
                while(s.size() != 0){
                    ans += s.pop();
                }
                break;
            }
        }
        if(s.size() == word.length()){
            return word;
        }
        for (i = i+1; i < word.length(); i++) {
            ans += word.charAt(i);
        }
        return ans;
    }
}