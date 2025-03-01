class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        for(int i = 0; i < n; i++){
            temp[i] = nums[i];
        }
        for(int i = 0; i < n - 1; i++){
            if(temp[i] == temp[i+1]){
                temp[i] = temp[i]*2;
                temp[i+1] = 0;
            }
        }
        System.out.println(Arrays.toString(temp));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(temp[i] > 0){
                list.add(temp[i]);
            }
        }
        int[] ans = new int[n];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}