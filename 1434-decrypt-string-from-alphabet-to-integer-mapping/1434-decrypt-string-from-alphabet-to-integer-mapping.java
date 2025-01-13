class Solution {
    public String freqAlphabets(String s) {
        String[] nums = s.split("#");
        String ans = "";
        String substr = "";
        String ch = "";
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i].length() > 2){
                for (int j = 0; j < nums[i].length()-2; j++) {
                    ch = String.valueOf(nums[i].charAt(j));
                    n = Integer.parseInt(ch);
                    ans += (char)(n+96); 
                }
                if (nums.length == 1 && s.charAt(s.length() - 1) == '#') {
                    substr = nums[i].substring(nums[i].length() - 2, nums[i].length());
                    n = Integer.parseInt(substr);
                    ans += (char)(n+96);
                }else if (nums.length == 1) {
                    for (int j = nums[i].length() - 2; j < nums[i].length(); j++) {
                        ch = String.valueOf(nums[i].charAt(j));
                        n = Integer.parseInt(ch);
                        ans += (char)(n+96); 
                    }
                }else{
                    substr = nums[i].substring(nums[i].length() - 2, nums[i].length());
                    n = Integer.parseInt(substr);
                    ans += (char)(n+96);
                }
            }else if (i==nums.length - 1 &&s.charAt(s.length() - 1) == '#') {
                substr = nums[i];
                n = Integer.parseInt(substr);
                ans += (char)(n+96);
            }else if (i == nums.length - 1) {
                for (int j = 0; j < nums[i].length(); j++) {
                    ch = String.valueOf(nums[i].charAt(j));
                    n = Integer.parseInt(ch);
                    ans += (char)(n+96); 
                }
            }else if(nums[i].length() == 2){
                substr = nums[i].substring(nums[i].length() - 2,nums[i].length());
                n = Integer.parseInt(substr);
                ans += (char)(n+96);
            }
        }
        return ans;
    }
}