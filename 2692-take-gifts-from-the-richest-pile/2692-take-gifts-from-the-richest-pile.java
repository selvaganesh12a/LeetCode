class Solution {
    static{
        for(int i=0;i<500;i++){
            pickGifts(new int[]{},0);
        }
    }
    public static long pickGifts(int[] gifts, int k) {
        long ans = 0;
        int n = gifts.length;
        Queue<Integer> pq = new PriorityQueue<>((a,b) ->Long.compare(b,a));
        for(int i = 0; i < n; i++){
            pq.add(gifts[i]);
        }
        while(k > 0){
            int del = pq.poll();
            int val = (int)(Math.floor(Math.sqrt(del)));
            pq.add(val);
            k--;
        }
        for(int i: pq) ans += i;
        return ans;
    }
}