class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(stack.peek() == s.charAt(i)){
                stack.push(s.charAt(i));
            }else if(stack.peek() != s.charAt(i)){
                stack.pop();
            }
            if(stack.size() == 0){
                ans += 1;
            }
        }
        return ans;
    }
}