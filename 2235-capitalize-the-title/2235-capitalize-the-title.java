class Solution {
    public String capitalizeTitle(String title) {
        title  = title.toLowerCase();
        String[] w = title.split(" ");
        String ans = "";
        for(int i = 0; i < w.length; i++){
            String up = w[i];
            if(up.length() <= 2 && i != w.length - 1){
                ans += up + " ";
                continue;
            }else if(up.length() <= 2){
                ans += up;
                continue;
            }
            up = up.toUpperCase();
            if(i != w.length - 1){
                ans += up.charAt(0) + w[i].substring(1) + " ";
            }else{
                ans += up.charAt(0) + w[i].substring(1);
            }
        }
        return ans;
    }
}