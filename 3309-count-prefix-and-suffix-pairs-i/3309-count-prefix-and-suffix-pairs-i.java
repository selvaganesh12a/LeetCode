class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            int len = temp.length();
            for (int j = i+1; j < words.length; j++) {
                if(i != j && len <= words[j].length()){
                    String word = words[j];
                    int wordLen = word.length();
                    String pre = word.substring(0,len);
                    String suf = word.substring(wordLen-len,wordLen);
                    if(pre.equals(temp) && suf.equals(temp)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}