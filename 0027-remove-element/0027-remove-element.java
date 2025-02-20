class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                list.add(nums[i]);
                k++;
            }
        }
        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        return k;
    }
}