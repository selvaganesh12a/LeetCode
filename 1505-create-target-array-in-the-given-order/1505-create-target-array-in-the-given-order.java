class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> tar = new LinkedList<>();
        for(int i = 0; i < nums.length; i++){
            tar.add(index[i],nums[i]);
        }
        int[] target = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            target[i] = tar.get(i);
        }
        return target;
    }
} 
