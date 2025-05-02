class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int m = logs.length,n = logs[0].length;
        int[] ans = new int[k];
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int key = logs[i][0];
                int val = logs[i][1];
                if(!map.containsKey(key)){
                    HashSet<Integer> set = new HashSet<>();
                    map.put(key,set);
                }
                map.get(key).add(val);
            }
        }

        int[] freq = new int[k+1];
        for(HashSet<Integer> set : map.values()){
            int size = set.size();
            if(size <= k) freq[size]++;
        }

        for(int i = 1; i < k+1; i++){
            ans[i - 1] = freq[i];
        }

        return ans;
    }
}