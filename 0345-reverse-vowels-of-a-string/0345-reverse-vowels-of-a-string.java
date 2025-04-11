class Solution {
    public static String reverseVowels(String q) {
        char[] c = q.toCharArray();
        int s = 0, e = q.length() - 1;
        while(s < e){
            if(c[s] == 'A' || c[s] == 'a' || c[s] == 'E' || c[s] == 'e' || c[s] == 'I' || c[s] == 'i' || c[s] == 'O' || c[s] == 'o' || c[s] == 'U' || c[s] == 'u'){
                while(e > s){
                    if(c[e] == 'A' || c[e] == 'a' || c[e] == 'E' || c[e] == 'e' || c[e] == 'I' || c[e] == 'i' || c[e] == 'O' || c[e] == 'o' || c[e] == 'U' || c[e] == 'u'){
                        char temp = c[s];
                        c[s] = c[e];
                        c[e] = temp;
                        e--;
                        break;
                    }
                    e--;
                }
            }
            s++;
        }
        return new String(c);
    }
}