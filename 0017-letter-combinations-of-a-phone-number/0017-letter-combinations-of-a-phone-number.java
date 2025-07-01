class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        return solve("",digits);
    }

    public ArrayList<String> solve(String p,String up) {
        if(up.isEmpty()){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        if(digit  <= 6){
            int i = (digit - 2) * 3;
            int count = 3;
            while(count > 0){
                count--;
                char ch = (char)('a' + i);
                ans.addAll(solve(p+ch,up.substring(1)));
                i++;
            }
            return ans;
        }else if(digit == 7){
            int i = (digit - 2) * 3;
            int count = 4;
            while(count > 0){
                count--;
                char ch = (char)('a' + i);
                ans.addAll(solve(p+ch,up.substring(1)));
                i++;
            }
            return ans;
        }else if(digit == 8){
            int i = (digit - 2) * 3 + 1;
            int count = 3;
            while(count > 0){
                count--;
                char ch = (char)('a' + i);
                ans.addAll(solve(p+ch,up.substring(1)));
                i++;
            }
            return ans;
        }else{
            int i = (digit - 2) * 3 + 1;
            int count = 4;
            while(count > 0){
                count--;
                char ch = (char)('a' + i);
                ans.addAll(solve(p+ch,up.substring(1)));
                i++;
            }
            return ans;
        }
    }
}