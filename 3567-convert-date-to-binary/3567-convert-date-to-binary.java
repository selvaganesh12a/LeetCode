class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder ans = new StringBuilder();
        String y = date.substring(0,4);
        String m = date.substring(5,7);
        String d = date.substring(8,10);
        ans.append(Integer.toBinaryString(Integer.parseInt(y)));
        ans.append("-");
        ans.append(Integer.toBinaryString(Integer.parseInt(m)));
        ans.append("-");
        ans.append(Integer.toBinaryString(Integer.parseInt(d)));
        return ans.toString();
    }
}