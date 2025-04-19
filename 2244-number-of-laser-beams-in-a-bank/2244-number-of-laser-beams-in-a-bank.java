class Solution {
    public int numberOfBeams(String[] bank) {
        long ans = 0,n = bank.length;
        for(int i = 0; i < n - 1; i++){
            long c1 = bank[i].chars().filter(ch -> ch == '1').count();
            if(c1 != 0){
                for(int j = i+1; j < n; j++){
                    long c2 = bank[j].chars().filter(ch -> ch == '1').count();
                    if(c2 != 0){
                        ans += c1*c2;
                        break;
                    }
                }
            }
        }
        return (int) ans;
    }
}