class Solution {
    public int minPartitions(String n) {
        int max = 0;
        int num = 0;
        for (int i = 0; i <= n.length() - 1; i++) {
            num = n.charAt(i) - 48;
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}