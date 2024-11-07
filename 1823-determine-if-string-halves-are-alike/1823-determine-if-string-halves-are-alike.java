class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < mid; i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='A'|| s.charAt(i)=='e' || s.charAt(i)=='E'|| s.charAt(i)=='i' || s.charAt(i)=='I'|| s.charAt(i)=='o' || s.charAt(i)=='O'|| s.charAt(i)=='u' || s.charAt(i)=='U'){
                count1 += 1;
            }
        }
        for (int i = mid; i < s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='A'|| s.charAt(i)=='e' || s.charAt(i)=='E'|| s.charAt(i)=='i' || s.charAt(i)=='I'|| s.charAt(i)=='o' || s.charAt(i)=='O'|| s.charAt(i)=='u' || s.charAt(i)=='U'){
                count2 += 1;
            }
        }
        if(count1 == count2){
            return true;
        }else{
            return false;
        }
    }
}