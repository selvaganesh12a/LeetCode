/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mount) {
        int n = mount.length();
        int peak = findPeak(mount, n);
        int left = BS(mount,0,peak,target,true);
        if(left != -1) return left;
        return BS(mount,peak+1,n-1,target,false);
    }

    public int findPeak(MountainArray mount, int n){
        int st = 0, end = n-1;
        while(st < end){
            int mid = st + (end - st) / 2;
            if(mount.get(mid) < mount.get(mid+1)) st = mid + 1;
            else end = mid;
        }
        return st;
    }

    public int BS(MountainArray mount,int st, int end, int target, boolean asc){
        while(st <= end){
            int mid = st + (end - st) / 2;
            int val = mount.get(mid);
            if(val == target) return mid;
            if(asc){
                if(val < target) st = mid + 1;
                else end = mid - 1;
            }else{
                if(val < target) end = mid - 1;
                else st = mid + 1;
            }
        }
        return -1;
    }
}