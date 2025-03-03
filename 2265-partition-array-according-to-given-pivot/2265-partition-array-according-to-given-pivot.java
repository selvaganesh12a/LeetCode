class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> great = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < pivot) less.add(nums[i]);
            else if(nums[i] > pivot) great.add(nums[i]);
            else equal.add(nums[i]);
        }
        int[] ans = new int[nums.length];
        int idx = 0;
        for(int i = 0; i < less.size(); i++){
            ans[idx++] = less.get(i);
        }
        for(int i = 0; i < equal.size(); i++){
            ans[idx++] = equal.get(i);
        }
        for(int i = 0; i < great.size(); i++){
            ans[idx++] = great.get(i);
        }
        return ans;
    }
}