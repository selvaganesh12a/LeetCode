class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length + 1];
        ans[0] = first;
        int idx = 0;
        for(int i = 1; i < ans.length; i++){
            ans[i] = ans[idx] ^ encoded[idx];
            idx++;
        }
        return ans;
    }
}