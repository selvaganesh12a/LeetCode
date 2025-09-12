class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= ans.get(ans.size() - 1)[1]){
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1],intervals[i][1]);
            }else ans.add(intervals[i]);
        }
        int[][] answer = new int[ans.size()][];
        for(int i = 0; i < ans.size(); i++){
            int[] temp = new int[2];
            temp[0] = ans.get(i)[0];
            temp[1] = ans.get(i)[1];
            answer[i] = temp;
        }
        return answer;
    }
}