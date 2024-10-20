class Solution {
    public static int findMin(int[] nums) {
        int peak = findPeakElement(nums);
        if(peak == nums.length - 1){
            return nums[0];
        }
        return nums[peak + 1];
    }
    public static int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }else if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;   
            }if (nums[mid] <= nums[start]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}