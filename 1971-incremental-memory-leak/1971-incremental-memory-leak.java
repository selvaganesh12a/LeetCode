class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int[] ans = new int[3];
        int i = 1;
        while(true){
            if(i <= memory1 && memory1 >= memory2) memory1 -= i;
            else if(i <= memory2 && memory2 >= memory1) memory2 -= i;
            else if(i > memory1 && i > memory2) break;
            i++;
        }
        ans[0] = i;
        ans[1] = memory1;
        ans[2] = memory2;
        return ans;
    }
}