class Solution {
    public static boolean search(int[] nums, int target) {
        int pivot = 0;
        if(nums.length == 1){
            if(nums[0]==target){
                return true;
            }
            else
                return false;
        }
        int max =nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] >= max && i+1 < nums.length){
                if(nums[i + 1] < nums[i]){
                    pivot = i;
                    break;
                }
                max = nums[i];
                pivot = i;
            }
        }
        boolean ans = binarySearch(nums,0,pivot,target);
        if(ans==false){
            ans = binarySearch(nums,pivot + 1,nums.length-1,target);
        }
        return ans;
    }

    static boolean binarySearch(int[] nums,int start,int end,int target){
        int mid=0;
        while(start<=end){
            mid = (start + end)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }
        }
        return false;
    }
}