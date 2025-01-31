class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        int size = 1;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }

        for (int i = 3; i <= arr.length; i += 2) {
            int pre = 0;
            int sum = 0;
            int j = 0;
            while(j < arr.length){
                if(j == 0){
                    while(j < i){
                        sum += arr[j++];
                    }
                    ans += sum;
                }else {
                    sum -= arr[pre];
                    sum += arr[j++];
                    ans += sum;
                    pre++;
                }
            }
        }
        return ans;
    }
}