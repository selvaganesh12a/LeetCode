class Solution {
    public int prefixCount(String[] words, String pref) {
        int len = pref.length();
        int count  = 0;
        for(int i = 0; i < words.length; i++){
            String temp = words[i];
            if(temp.length() >= len){
                String sub = temp.substring(0,len);
                if(pref.equals(sub)){
                    count++;
                }
            }
        }
        return count;
    }
}