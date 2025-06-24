class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans = 0;
        int n = gifts.length;
        while(k > 0){
            Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            for(int i = 0; i < n; i++){
                pq.add(gifts[i]);
            }
            int del = pq.poll();
            int val = (int)(Math.floor(Math.sqrt(del)));
            for(int i = 0; i < n; i++){
                if(del == gifts[i]) {
                    gifts[i] = val;
                    break;
                }
            }
            k--;
        }
        for(int i: gifts) ans += i;
        return ans;
    }
}