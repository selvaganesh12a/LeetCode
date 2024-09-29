class Solution {
    public static int findKthPositive(int[] arr, int k) {
        boolean ans;
        int temp = 0;
        int i = 1;

        for (i = 1; i < 1001 + k; i++) {
            ans = binary(arr, 0, arr.length - 1, i);
            if(!ans){
                temp += 1;
            }
            if(temp == k){
                break;
            }
        }
        return i;
    }

    static boolean binary(int[] num, int start, int end,int target){
        int mid = 0;

        while(start <= end){
            mid = (start + end)/2;

            if(num[mid] == target){
                return true;
            }else if(num[mid] > target){
                end = mid - 1;
            }else if(num[mid] < target){
                start = mid + 1;
            }
        }
        return false;
    }
}