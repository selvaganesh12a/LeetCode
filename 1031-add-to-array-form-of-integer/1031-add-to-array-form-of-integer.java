class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int carry = 0;

        for (int i = num.length - 1; i >= 0; i--) {
            int temp = num[i] + k + carry;
            k = temp;
            ans.add(temp % 10);
            k /= 10;    
        }

        if(k > 0){
            while(k != 0){
                int tem = k % 10;
                k /= 10;
                ans.add(tem);
            }
            
        }

        if(ans.get(ans.size() - 1) == 0){
            ans.add(1);
        }

        return ans.reversed();
    }
}