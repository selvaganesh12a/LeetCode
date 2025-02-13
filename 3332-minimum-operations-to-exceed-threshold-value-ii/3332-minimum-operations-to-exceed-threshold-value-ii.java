class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i : nums) {
            pq.add((long)i);
        }
        if(pq.stream().allMatch(e -> e >= k)){
            return 0;
        }
        int ans = 0;
        while(true){
            long a = pq.poll();
            long b = pq.poll();
            long c = Math.min(a,b) * 2L + Math.max(a,b);
            pq.add(c);
            ans += 1;
            if(pq.stream().allMatch(e -> e >= k)){
                break;
            }
        }
        return ans;
    }
}