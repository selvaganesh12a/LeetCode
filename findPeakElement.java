public class findPeakElement {

    //https://leetcode.com/problems/find-peak-element/description/
    //this is the answer code to the problem number: 1929 in leetCode
    public static int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<end){
            mid = start + (end - start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else if (nums[mid]<nums[mid+1]){
                start=mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }
}
