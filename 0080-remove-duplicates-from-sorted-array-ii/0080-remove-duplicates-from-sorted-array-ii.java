class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums) map.put(i,map.getOrDefault(i,0) + 1);
        int n = nums.length, s = 0, e = n - 1, ans = 0;
        while(s < n){
            if(map.get(nums[s]) > 2){
                int temp = map.get(nums[s]) + s - 1;
                map.put(nums[s],map.get(nums[s]) - 1);
                while(temp < n - 1){
                    int t = nums[temp];
                    nums[temp] = nums[temp+1];
                    nums[temp+1] = t;
                    temp++;
                }
            }else{
                s++;
            }
        }
        for (int i : map.keySet()) {
            if(map.get(i) <= 2) ans+=map.get(i);
            else ans += 2;
        }
        return ans;
    }
}