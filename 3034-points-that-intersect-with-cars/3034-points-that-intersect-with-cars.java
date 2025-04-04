class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int m = nums.size(), n = nums.get(0).size();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < m; i++){
            int a = nums.get(i).get(0);
            int b = nums.get(i).get(1);
            for(int j = a; j <= b; j++){
                set.add(j);
            }
        }
        return set.size();
    }
}