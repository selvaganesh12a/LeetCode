class Solution {
    public int findLucky(int[] arr) {
        ArrayList<Integer> lucky = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: arr) map.put(i,map.getOrDefault(i,0) + 1);
        for(int i: map.keySet()){
            if(map.get(i) == i) lucky.add(i);
        }
        Collections.sort(lucky);
        if(lucky.size() == 0) return -1;
        return lucky.get(lucky.size() - 1);
    }
}