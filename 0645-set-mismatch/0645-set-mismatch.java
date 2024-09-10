class Solution {
    public static int[] findErrorNums(int[] nums) {
        List<Integer> a = new ArrayList<>(); 
        int i = 0;

        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                a.add(nums[j]);
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1 ){
                a.add(j+1);
            }
        }
        
        int[] ans = new int[a.size()];
        for (int l = 0; l < a.size(); l++) {
            ans[l] = a.get(l);
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}