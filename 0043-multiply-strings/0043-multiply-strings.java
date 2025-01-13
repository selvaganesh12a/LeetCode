class Solution {
    public String multiply(String num1, String num2) {
        String ans = "";
        if(num1.charAt(0) =='0' || num2.charAt(0) == '0'){
            return "0";
        }
        int[] temp = new int[num1.length()+num2.length()];
        int carry = 0;
        int idx = temp.length;
        for (int i = num2.length() - 1; i >= 0; i--) {
            idx -= 1;
            int idx2 = idx;
            int dig2 = num2.charAt(i) - '0';
            for (int j = num1.length() - 1; j >= 0; j--) {
                int dig1 = num1.charAt(j) - '0';
                int mul = dig1*dig2;
                temp[idx2] += mul;
                idx2--;
            }
        }

        for (int i = temp.length - 1; i >= 0; i--) {
            int val = temp[i];
            int dig = val % 10;
            if(dig+carry < 10){
                ans = (dig + carry) + ans;
                carry = val / 10;
            }else{
                int digit = (dig+carry) % 10;
                ans = (digit) + ans;
                carry = (val+carry) / 10;
            }
        }
        if(ans.charAt(0) == '0'){
            StringBuilder answer = new StringBuilder();
            for (int i = 1; i < ans.length(); i++) {
                answer.append(ans.charAt(i));
            }
            return answer.toString();
        }else{
            return ans;
        }
    }
}