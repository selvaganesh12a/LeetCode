class Solution {
    public int divisorSubstrings(int num, int k) {
        String ques = String.valueOf(num);
        int n = ques.length(), ans = 0;
        for(int i = 0; i <= n - k; i++){
            String temp = ques.substring(i,i+k);
            int sub = Integer.parseInt(temp);
            if(sub > 0 && num%sub == 0) ans++;
        }
        return ans;
    }
}