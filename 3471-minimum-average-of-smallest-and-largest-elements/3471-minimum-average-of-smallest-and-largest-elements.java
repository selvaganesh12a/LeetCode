class Solution {
    public double minimumAverage(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Double> avg = new ArrayList<>();
        for(int i = 0;i < nums.length; i++){
            list.add(nums[i]);
        }
        Collections.sort(list);
        while(list.size() != 0){
            double a = (double)list.remove(0);
            double b = (double)list.remove(list.size() - 1);
            double c = (double)((a+b)/2);
            avg.add(c);
        }
        Collections.sort(avg);
        return avg.get(0);
    }
}