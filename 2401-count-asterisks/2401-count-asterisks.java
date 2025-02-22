class Solution {
    public int countAsterisks(String s) {
        String[] w = s.split("\\|");
        int c = 0;
        for(int i = 0; i < w.length; i+=2){
            for(int j = 0; j < w[i].length(); j++){
                if(w[i].charAt(j) == '*') c+=1;
            }
        }
        return c
        ;
    }
}