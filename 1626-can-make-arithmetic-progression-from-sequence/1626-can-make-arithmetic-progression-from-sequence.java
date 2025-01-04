class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[arr.length - 1] - arr[arr.length - 2];
        for(int i =  arr.length - 1; i > 0; i--){
            if((arr[i] - arr[i - 1]) != diff){
                return false;
            }
        }
        return true;
    }
}