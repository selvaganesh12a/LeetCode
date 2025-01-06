class Solution {
    public int maximumGroups(int[] grades) {
        int len = grades.length;
        int group = 0;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if(len - (i + 1) >= 0){
                group += i+1;
                count += 1;
                len -= i+ 1;
            }
        }
        return count;
    }
}