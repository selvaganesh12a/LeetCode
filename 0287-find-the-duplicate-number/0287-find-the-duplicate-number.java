class Solution {
    public static int findDuplicate(int[] nums){
        int ans = 0;
        int i = 0;

        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

        return nums[nums.length - 1];
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}