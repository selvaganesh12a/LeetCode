class Solution {
    public static int firstMissingPositive(int[] nums){
        int i = 0;

        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != i+1 && nums[i] <= nums.length && nums[i] > 0){
                swap(nums, i, correct);
                if(nums[i] == nums[correct]){
                    i++;
                }
            }else{
                i++;
            }
        }
        
        
        int j ;
        for (j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums[j-1]+1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}