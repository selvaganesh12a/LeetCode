class Solution {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] num = new int[in.nextInt()];
        System.out.println(Arrays.toString(buildArray(num)));
    }
}