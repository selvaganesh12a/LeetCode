class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= blocks.length() - k; i++) {
            String sub = blocks.substring(i,i+k);
            int c = 0;
            for (int j = 0; j < sub.length(); j++) {
                if(sub.charAt(j) == 'W'){
                    c++;
                }
            }
            if(c < min){
                min = c;
            }
        }
        return min;
    }
}