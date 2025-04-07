class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int j = 0; j < points.length; j++) {
                int x1 = points[j][0];
                int y1 = points[j][1];
                int x2 = queries[i][0];
                int y2 = queries[i][1];
                double d = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
                if(d <= queries[i][2]) count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}