class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i][0],map.getOrDefault(nums1[i][0],0) + nums1[i][1]);
        }
        for(int i = 0; i < nums2.length; i++){
            map.put(nums2[i][0],map.getOrDefault(nums2[i][0],0) + nums2[i][1]);
        }
        int[][] ans = new int[map.size()][2];
        int idx = 0;
        for (int i: map.keySet()) {
            ans[idx][0] = i;
            ans[idx++][1] = map.get(i);
        }
        Arrays.sort(ans, Comparator.comparingInt(a -> a[0]));
        return ans;
    }
}