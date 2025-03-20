class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int winsize = 3,ans = 0, start = 0, end = 2, mid = start + 1, n = colors.length;
        for(int i = 0; i < n; i++){
            start = i;
            mid = (start+1)%n;
            end = (i+2)%n;
            if(colors[start] != colors[mid] && colors[mid] != colors[end]) ans++;
        }
        return ans;
    }
}