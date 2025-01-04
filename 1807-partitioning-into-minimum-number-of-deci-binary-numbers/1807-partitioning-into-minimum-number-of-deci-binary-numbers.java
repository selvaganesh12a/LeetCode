class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for (int i = 9; i >= 0; i--) {
            if(n.contains(String.valueOf(i))){
                max = i;
                break;
            }
        }
        return max;
    }
}