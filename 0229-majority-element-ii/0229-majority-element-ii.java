class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums) map.put(i,map.getOrDefault(i,0) + 1);
        int n = nums.length,k = n/3;
        for(int i: map.keySet()){
            if(map.get(i) > k) ans.add(i);
        }
        return ans;
    }
}