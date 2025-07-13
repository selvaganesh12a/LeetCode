class Solution {
    public int findCenter(int[][] edges) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < edges.length;i++){
            for(int j = 0; j < edges[i].length; j++){
                map.put(edges[i][j],map.getOrDefault(edges[i][j],0) + 1);
            }
        }
        for(int i: map.keySet()){
            if(map.get(i) == edges.length) return i;
        }
        return -1;
    }
}