class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0, count = 0, n = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) count++;
        }
        while(count > 0){
            Queue<Integer> pq = new PriorityQueue<>();
            for(int i = 0; i < n; i++){
                if(nums[i] > 0) pq.add(nums[i]);
            }
            int val = pq.poll();
            count = 0;
            for(int i = 0; i < n; i++){
                if(nums[i] > 0) nums[i] = nums[i] - val;
                if(nums[i] > 0) count++;
            }
            ans++;
        }
        return ans;
    }
}