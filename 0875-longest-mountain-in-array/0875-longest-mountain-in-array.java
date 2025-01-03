class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int i,max_length = 0;
        for (i = 1; i <= n - 2; i++) {
            if(arr[i] > arr[i - 1] && arr[i] > arr[i+1]){
                int length = 1;
                int j = i;
                while(j > 0 && arr[j] > arr[j - 1]){
                    length++;
                    j--;
                }
                int k = i;
                while(k < n - 1 && arr[k] > arr[k + 1]){
                    length++;
                    k++;
                }
                if(max_length < length){
                    max_length = length;
                }
            }
        }
        return max_length;
    }
}