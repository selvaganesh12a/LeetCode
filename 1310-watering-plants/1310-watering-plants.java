class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans = 0, idx = 0, vol = capacity, n = plants.length;
        while(idx < n){
            if(vol >= plants[idx]){
                ans += 1;
                vol -= plants[idx];
            }else if(vol < plants[idx]){
                ans += idx;
                vol = capacity;
                ans += idx + 1;
                vol -= plants[idx];
            }
            idx++;
        }
        return ans;
    }
}