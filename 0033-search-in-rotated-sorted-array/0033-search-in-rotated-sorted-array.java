class Solution {
    public int search(int[] nums, int target) {
        int pivot = 0;
        if(nums.length == 1){
            if(nums[0]==target){
                return 0;
            }
            else
                return -1;
        }
        int max =nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>max){
                max = nums[i];
                pivot = i;
            }
        }
        int ans = binarySearch(nums,0,pivot,target);
        if(ans==-1){
            ans = binarySearch(nums,pivot+1,nums.length-1,target);
        }
        return ans;
    }
    static int binarySearch(int[] nums,int start,int end,int target){
        int mid=0;
        while(start<=end){
            mid = (start + end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }
        }
        return -1;
    }
}
