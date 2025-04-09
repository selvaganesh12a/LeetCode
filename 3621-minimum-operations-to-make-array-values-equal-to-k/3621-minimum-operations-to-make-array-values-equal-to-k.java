class Solution {
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        for(int i: map.keySet()){
            if(i > k) ans++;
            if(i < k) return -1;
        }
        
        return ans;
    }
}