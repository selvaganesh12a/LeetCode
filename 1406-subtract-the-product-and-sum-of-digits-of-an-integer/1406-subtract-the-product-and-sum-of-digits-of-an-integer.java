class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int pro = 1;
        int sum = 0;
        while(temp != 0){
            int val = temp % 10;
            pro *= val;
            sum += val;
            temp /= 10;
        }
        return pro - sum;
    }
}