class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        int[] pref = new int[words.length];
        int c = 0;
        for(int i = 0; i < words.length; i++){
            char ch1 = words[i].charAt(0);
            char ch2 = words[i].charAt(words[i].length() - 1);
            if((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') && (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u')) c++;
            pref[i] = c;
        }

        for(int i = 0; i < queries.length; i++){
            int st = queries[i][0];
            int end = queries[i][1];
            if(st != 0) ans[i] = pref[end] - pref[st - 1];
            else ans[i] = pref[end];
        }
        return ans;
    }
}