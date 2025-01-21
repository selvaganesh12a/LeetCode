class Solution {
    public boolean judgeCircle(String moves) {
        boolean ans= false;
        int[] pos = {0,0};
        int[] copy ={0,0};
        for (char val: moves.toCharArray()) {
            if(val == 'U')
                pos[1] += 1;
            else if (val =='D') {
                pos[1] -= 1;
            }else if (val =='R') {
                pos[0] += 1;
            }else if (val =='L') {
                pos[0] -= 1;
            }
        }
        if(pos[1] == copy[1] && pos[0] == pos[1])
            ans = true;
        return ans;
    }
}