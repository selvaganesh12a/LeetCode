class Solution {
    public static int[] sortArrayByParity(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s<=e) {
            if(nums[s] % 2 == 0){
                s += 1;
            }
            else{
                if(nums[e] % 2 == 1){
                    e -= 1;
                }else{
                    swap(nums,s,e);
                }
            }
        }
        return nums;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}