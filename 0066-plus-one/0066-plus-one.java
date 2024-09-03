class Solution {
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        int last = digits.length - 1;

        if(digits[last] == 9){
            digits[last] = 0;
            while(last > 0){
                if(digits[last-1] == 9){
                    digits[last - 1] = 0;
                    last -= 1;
                }else{
                    digits[last - 1] += carry;
                    break;
                }
            }
        }else{
            digits[last] += 1;
        }

        int len = digits.length - 1;
        if(digits[0] == 0){
            int[] ans = new int[digits.length + 1];
            while(len > 0){
                ans[len] = digits[len];
                len -= 1;
            }
            ans[0] = 1;
            return ans;
        }else{
            return digits;
        }

    }
}