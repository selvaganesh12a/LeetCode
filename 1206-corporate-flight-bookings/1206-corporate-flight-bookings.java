class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        for(int[] nums : bookings){
            int s = nums[0];
            int e = nums[1];
            int val = nums[2];
            for(int i = s; i <= e; i++){
                ans[i-1] += val;
            }
        }
        return ans;
    }
}