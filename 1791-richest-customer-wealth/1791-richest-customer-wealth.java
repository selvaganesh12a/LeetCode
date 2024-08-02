class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int total = 0;
        for(int i = 0; i < accounts.length; i++){
            if(total>sum){
                    sum = total;
                }
            total = 0;
            for(int j = 0; j < accounts[i].length; j++){
                total  += accounts[i][j];
            }
        }
        if(accounts.length == 1){
            return total;
        }
        return sum;
    }
}