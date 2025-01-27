class Solution {
    public boolean isLongPressedName(String name, String typed) {
        boolean ans = false;
        int n = 0;
        int t = 0;
        boolean[] flag = new boolean[name.length()];
        if(typed.charAt(typed.length() - 1) != name.charAt(name.length() - 1))
            return false;
        while(n < name.length()){
            while(t < typed.length()){
                if(flag[name.length() - 1] == true && typed.charAt(t) != name.charAt(name.length() - 1)){
                    return false;
                }
                if(name.charAt(n) == typed.charAt(t)){
                    flag[n] = true;
                    t++;
                    if(n+1 < name.length() && t < typed.length() && name.charAt(n+1) == typed.charAt(t)){
                        flag[n+1] = true;
                        n++;
                    }
                }
                else{
                    break;
                }
            }
            n++;
        }
        for (boolean b : flag) {
            if (b == false) {
                ans = false;
                return ans;
            }
        }
        ans = true;
        return ans;
    }
}