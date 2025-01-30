class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < boxes.length(); i++) {
            if(boxes.charAt(i) == '1'){
                list.add(i);
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                ans[i] += Math.abs(list.get(j) - i);
            }
        }
        return ans;
    }
}