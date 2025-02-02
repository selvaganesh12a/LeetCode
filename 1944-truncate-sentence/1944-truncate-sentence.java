class Solution {
    public String truncateSentence(String s, int k) {
        String ans = "";
        String[] words = s.split(" ");
        for (int i = 0; i < k; i++) {
            if (i == k - 1){
                ans += words[i];
                break;
            }
            ans += words[i] + " ";
        }
        return ans;
    }
}