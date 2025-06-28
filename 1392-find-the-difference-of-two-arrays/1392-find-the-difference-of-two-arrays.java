class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> a = new HashSet<>();
        for(int i: nums1) a.add(i);
        HashSet<Integer> b = new HashSet<>();
        for(int i: nums2) b.add(i);
        ArrayList<Integer> temp1 = new ArrayList<>();
        for(int i: a){
            if(!b.contains(i)) temp1.add(i);
        }
        ans.add(temp1);
        ArrayList<Integer> temp2 = new ArrayList<>();
        for(int i: b){
            if(!a.contains(i)) temp2.add(i);
        }
        ans.add(temp2);
        return ans;
    }
}