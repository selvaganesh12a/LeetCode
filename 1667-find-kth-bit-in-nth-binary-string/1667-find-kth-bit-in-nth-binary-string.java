class Solution {
    static int count = 0;
    public static char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        find(sb,count,n);
        return sb.charAt(k-1);
    }

    private static void find(StringBuilder sb,int count, int n){
        if(count == n) return;
        count++;
        StringBuilder inv = inverse(sb);
        inv.reverse();
        sb.append("1").append(inv);
        find(sb,count,n);
    }

    private static StringBuilder inverse(StringBuilder sb){
        StringBuilder inv = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if(c == '0') inv.append("1");
            else inv.append("0");
        }
        return inv;
    }
}