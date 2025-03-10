class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0) + 1);
        }
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0) + 1);
        }
        int c = 0;
        for(int i: map2.keySet()){
            for(int j: map1.keySet()){
                if(i == j) c += map1.get(j);
            }
        }
        ans[0] = c;
        c = 0;
        for(int i: map1.keySet()){
            for(int j: map2.keySet()){
                if(i == j) c += map2.get(j);
            }
        }
        ans[1] = c;
        return ans;
    }
}