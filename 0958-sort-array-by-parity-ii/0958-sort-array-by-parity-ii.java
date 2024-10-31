class Solution {
    public static int[] sortArrayByParityII(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            if((nums[s] % 2 == 0 && s % 2 == 0) || (nums[s] % 2 == 1 && s % 2 == 1)){
                s += 1;
            }else if(s % 2 == 0){
                if(nums[e] % 2 == 0){
                    swap(nums, s, e);
                    e = nums.length - 1;
                }else{
                    e -= 1;
                }
            }else if(s % 2 == 1){
                if(nums[e] % 2 == 1){
                    swap(nums, s, e);
                }else{
                    e -= 1;
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