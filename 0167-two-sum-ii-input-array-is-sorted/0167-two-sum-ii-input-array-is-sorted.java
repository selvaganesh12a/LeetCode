class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];

        int tar = 0;
        int idx = 0;
        int answer = 0;

        while(idx < numbers.length){
            tar = target - numbers[idx];
            answer = binary(numbers,idx+1,numbers.length - 1,tar);
            if(answer == -1){
                idx += 1;
            }else{
                break;
            }
        }
        ans[0] = idx+1;
        ans[1] = answer+1;

        return ans;
    }

    static int binary(int[] nums, int start, int end, int tar){
        while(start <= end){
            int mid = (start + end) / 2;

            if(nums[mid] == tar){
                return mid;
            }else if(nums[mid] > tar){
                end = mid - 1;
            }else if(nums[mid] < tar){
                start = mid + 1;
            }
        }
        return -1;
    }
}