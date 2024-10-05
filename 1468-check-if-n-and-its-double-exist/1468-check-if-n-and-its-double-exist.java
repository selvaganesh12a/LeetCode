class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        boolean ans = false;
        for (int i = 0; i < arr.length - 1; i++) {
            int target = arr[i];
            if(target == 0){
                ans = binary(arr, i+1, arr.length - 1, target*2);
            }else{
                ans = binary(arr, 0, arr.length - 1, target*2); 
            }
            if(ans == true){
                break;
            }
        }
        return ans;
    }

    static boolean binary(int[] nums, int start, int end, int target){
        int mid = 0;

        while(start <= end){
            mid = (start + end) / 2;

            if(nums[mid] == target){
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