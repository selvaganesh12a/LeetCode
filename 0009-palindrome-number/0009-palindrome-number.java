class Solution {
    public boolean isPalindrome(int x) {
      //  boolean result = false;
        int rev = 0;
        int rem = 0;
        int temp = x;

        if(x<0){
           return false;
        //    // -121
        //    x = x*(-1);
        }
        while(temp != 0){
            rem = temp % 10;
            temp /= 10;
            rev = (rev*10)+rem; 
        }
        return rev==x;
    }
}