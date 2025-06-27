class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        if(stones.length == 2){
            if(stones[0] == stones[1]) return 0;
            else if(stones[0] != stones[1]) return Math.abs(stones[0] - stones[1]);
        }
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i: stones) pq.add(i);
        while(pq.size() >= 3){
            int a = pq.poll();
            int b = pq.poll();
            int c = 0;
            if(a != b){
                c = a- b;
            }
            pq.add(c);
        }
        if(pq.size() == 2){
            int a = pq.poll();
            int b = pq.poll();
            if(a != b) pq.add(Math.abs(a - b));
        }
        if(pq.size() == 0) return 0;
        return pq.poll();
    }
}