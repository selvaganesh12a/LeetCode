class Solution {
    public int maxPower(String s) {
        int[] pow = new int[s.length()];
        int temp = 1;
        for(int i = 0; i < s.length(); i++){
            if(i > 0 && s.charAt(i) == s.charAt(i - 1)){ 
                temp++;
                pow[i] = temp;
            }else{
                pow[i] = 1;
                temp = 1;
            } 
        }
        int ans = Integer.MIN_VALUE;
        for(int i: pow) if(ans < i) ans = i;
        return ans;
    }
}