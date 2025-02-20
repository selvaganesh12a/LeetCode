class Solution {
    public boolean isBalanced(String num) {
        char[] nums = num.toCharArray();
        int e = 0;
        int o = 0;
        for(int i = 0;i < nums.length; i++){
            if((i&1) == 1){
                o += Integer.parseInt(String.valueOf(nums[i]));
            }else{
                e += Integer.parseInt(String.valueOf(nums[i]));
            }
        }
        return (e == o);
    }
}