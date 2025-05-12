class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        return find(n);
    }
    public boolean find(int n){
        if(n == 1) return true;
        if(n == 0) return false;
        return ((n%4) == 0) && find(n/4);
    }
}