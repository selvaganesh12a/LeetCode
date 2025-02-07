class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> countMap = new HashMap<>();
        int[] ans = new int[queries.length];
        int distinctValues = 0;
        for (int i = 0; i < queries.length; i++) {
            int key = queries[i][0];
            int value = queries[i][1];
            if(map.containsKey(key)){
                int oldValue = map.get(key);
                countMap.put(oldValue,countMap.get(oldValue) - 1);
                if(countMap.get(oldValue) == 0){
                    distinctValues--;
                    countMap.remove(oldValue);
                }
            }
            map.put(key,value);
            countMap.put(value,countMap.getOrDefault(value,0) + 1);
            if(countMap.get(value) == 1){
                distinctValues++;
            }
            ans[i] = distinctValues;
        }
        return ans;
    }
}