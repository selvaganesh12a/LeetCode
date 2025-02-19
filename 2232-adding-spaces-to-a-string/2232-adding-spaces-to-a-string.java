class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder(s);
        for (int i = 0; i < spaces.length; i++) {
            ans = ans.insert(spaces[i] + i," ");
        }
        return ans.toString();
    }
}