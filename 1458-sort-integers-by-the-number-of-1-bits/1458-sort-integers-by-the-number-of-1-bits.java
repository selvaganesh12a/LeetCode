class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int[] ans = new int[arr.length];
        int[] temp = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while(num != 0){
                if(num % 2 == 1){
                    count += 1;
                }
                num /= 2;
            }
            temp[i] = count;
            count = 0;
        }
        int max = 0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] > max){
                max = temp[i];
            }
        }
        int idx = 0;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < temp.length; j++) {
                if(i == temp[j]){
                    ans[idx] = arr[j];
                    idx += 1;
                }
            }
        }

        return ans;
    }
}