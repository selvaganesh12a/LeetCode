class Solution {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        Arrays.sort(arr1);
        int[] temp = new int[2];
        int idx = 0;
        int j = 0;
        for(int i = 0; i < arr2.length; i++){
            temp = searchRange(arr1,arr2[i]);
            for(j = temp[0]; j <= temp[1]; j++){
                ans[idx] = arr1[j];
                idx += 1;
            }
        }
        HashSet<Integer> not = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            not.add(arr2[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            if(!not.contains(arr1[i])){
                ans[idx] = arr1[i];
                idx += 1;
            }
        }
        return ans; 
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        result[0] = left;
        result[1] = right;
        return result;        
    }

    public static int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
        int left = 0;
        int right = nums.length - 1;
        int idx = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                idx = mid;
                if (isSearchingLeft) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return idx;
    }
}