class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int n = s1.length(),count = 0;
        for(int i = 0; i < n; i++){
            if(a[i]>=b[i]) count++;
        }
        if(count == n) return true;
        else{
            count = 0;
            for(int i = 0; i < n; i++){
                if(b[i]>=a[i]) count++;
            }
            if(count == n) return true;
            else return false;
        }
    }
}