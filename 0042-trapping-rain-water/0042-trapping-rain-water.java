class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int n = height.length;
        int l = 0;
        int r = height.length - 1;
        int lhb = height[0];
        int rhb = height[height.length - 1];
        while(l <= r){
            if(lhb <= rhb){
                if(height[l] > lhb) lhb = height[l];
                else ans += lhb - height[l];
                l++;
            }else{
                if(height[r] > rhb) rhb = height[r];
                else ans += rhb - height[r];
                r--;
            }
        }
        return ans;
    }
}