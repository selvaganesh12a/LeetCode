class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num / 2;
        int mid = 0;
        
        if(num == 1){
            return true;
        }
        
        while(start <= end){
            mid = (start + end) / 2;

            if(mid*mid == num){
                return true;
            }else if(mid*mid > num){
                end = mid - 1;
            }else if(mid*mid < num){
                start = mid + 1;
            }
        }
        return false;
    }
}