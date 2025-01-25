class Solution {
    public static int numberOfSteps(int num) {
        return count(num,0);
    }

    private static int count(int num, int ans) {
        if(num == 0){
            return ans;
        }
        if(num % 2 == 0){
            return count(num/2,ans+1);
        }else{
            return count((num - 1), ans+1);
        }
    }
}