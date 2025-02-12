class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();
        int maxsum = -1;
        for (int i : nums) {
            if(!map.containsKey(sum(i))){
                map.put(sum(i),new int[]{i, - 1});
            }else{
                int[] pair = map.get(sum(i));
                if(i >  pair[0]){
                    pair[1] = pair[0];
                    pair[0] = i;
                }else if (i > pair[1]){
                    pair[1] = i;
                }
                if(pair[1] != -1){
                    maxsum = Math.max(maxsum,pair[0] + pair[1]);
                }
            }
        }
        return maxsum;
    }
    private static int sum(int n){
        if(n==0)
            return 0;
        return n % 10 + sum(n / 10);
    }
}