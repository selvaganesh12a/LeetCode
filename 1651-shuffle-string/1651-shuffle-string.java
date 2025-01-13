class Solution {
    public String restoreString(String s, int[] indices) {
        String ans = "";
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices.length; j++) {
                if(i == indices[j]){
                    ans += s.charAt(j);
                }
            }
        }
        return ans;
    }
}