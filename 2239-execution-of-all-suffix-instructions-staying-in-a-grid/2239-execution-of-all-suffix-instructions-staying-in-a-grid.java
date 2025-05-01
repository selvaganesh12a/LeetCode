class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int len = s.length();
        int[] ans = new int[len];
        for(int i = 0; i < len; i++){
            int[] pos = new int[2];
            pos[0] = startPos[0];
            pos[1] = startPos[1];
            int c = 0;
            for(int j = i; j < len; j++){
                if(s.charAt(j) == 'R'){
                    pos[1]++;
                }else if(s.charAt(j) == 'L'){
                    pos[1]--;
                }else if(s.charAt(j) == 'U'){
                    pos[0]--;
                }else if(s.charAt(j) == 'D'){
                    pos[0]++;
                }
                if(pos[0] < n && pos[1] < n && pos[0] >= 0 && pos[1] >= 0){
                    c++;
                }else break;
            }
            ans[i] = c;
        }
        return ans;
    }
}