class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int temp = n;

        if(n % 2 == 0){
            for(int i = 0; i < n/2; i++,temp--){
                ans[i] = i+1;
                ans[temp-1] = ans[i]*-1;
            }
        }else{
            for(int i = 0; i < n/2; i++,temp--){
                ans[i] = i+1;
                ans[temp-1] = ans[i]*(-1);
            }
            ans[n/2] = 0;  
        }
        return ans;
    }
}