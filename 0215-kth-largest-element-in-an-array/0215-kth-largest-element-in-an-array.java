class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int count = 0;
        for(i = nums.length -1; i >= 0; i--){
            count += 1;
            if(count == k){
                break;
            }
        }
        return nums[i];
    }
}