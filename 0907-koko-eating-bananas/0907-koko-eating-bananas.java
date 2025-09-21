class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for(int i : piles)
            high = Math.max(high,i);
        
        while(low < high){
            int mid = low + (high - low) / 2;
            if(caneat(piles,h,mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    public boolean caneat(int[] piles, int h, int val){
        long sum = 0;
        for(int i: piles){
            sum += (i + val - 1) / val;
        }
        return sum <= h;
    }
}