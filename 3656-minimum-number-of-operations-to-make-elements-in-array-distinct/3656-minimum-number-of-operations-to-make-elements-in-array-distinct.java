class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        boolean f = false;
        ArrayList<Integer> dup = new ArrayList<>();
        for(int i : map.keySet()){
            if(map.get(i) > 1){
                f = true;
                dup.add(i);
            }
        }
        if(f){
            int s = 0;
            while(dup.size() != 0){
                for(int i = 0;s < nums.length && i < 3; i++){
                    map.put(nums[s],map.get(nums[s]) - 1);
                    if(dup.contains(nums[s])){
                        if(map.get(nums[s]) <= 1){
                            dup.remove(Integer.valueOf(nums[s]));
                        }
                    }
                    s++;
                }
                ans++;
            }
        }else{
            return 0;
        }
        return ans;
    }
}