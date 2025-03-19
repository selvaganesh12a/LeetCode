class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if(k == 0){
            for(int i = 0; i < n; i++){
                ans[i] = 0;
            }
            return ans;
        }else if(k > 0){
            int sum = 0;
            for(int i = 0; i < n; i++){
                for(int j = 1; j <= k; j++){
                    sum += code[(i + j) % n];
                }
                ans[i] = sum;
                sum = 0;
            }
            return ans;
        }else {
            k = Math.abs(k);
            int sum = 0;
            for(int i = 0; i < n; i++){
                for(int j = 1; j <= k; j++){
                    sum += code[(i - j + n) % n];
                }
                ans[i] = sum;
                sum = 0;
            }
            return ans;
        }
    }
}