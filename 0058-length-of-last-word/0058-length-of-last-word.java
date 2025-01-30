class Solution {
    public int lengthOfLastWord(String s) {
        String[] q = s.split(" ");
        return q[q.length - 1].length();
    }
}