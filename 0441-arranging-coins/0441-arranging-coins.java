class Solution {
    public int arrangeCoins(int n) {
        int a = 1;
        int b = 1;
        double c = n*-1;
        double ans = 0;

        ans = ((b*b) - (Math.sqrt((b*b) - (4*a*c*2)))) / (2*a);

        return (int)ans * -1;
    }
}