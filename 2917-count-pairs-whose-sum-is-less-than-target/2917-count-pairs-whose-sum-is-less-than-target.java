class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int[] num = new int[nums.size()];
        for (int i = 0; i < num.length; i++) {
            num[i] = nums.get(i);
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        int count = 0;

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if(num[i] + num[j] < target){
                    count += 1;
                }
            }
        }
        return count;
    }
}