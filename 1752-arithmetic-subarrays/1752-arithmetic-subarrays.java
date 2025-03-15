class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int st = l[i];
            int end = r[i];
            int[] temp = new int[(end - st) + 1];
            int idx = 0;
            for (int j = st; j <= end; j++) {
                temp[idx++] = nums[j];
            }
            Arrays.sort(temp);
            if(temp.length == 1){
                ans.add(true);
            }else{
                int diff = temp[1] - temp[0];
                boolean f = false;
                for (int j = 1; j < temp.length; j++) {
                    if((temp[j] - temp[j - 1]) != diff) {
                        f = true;
                        ans.add(false);
                        break;
                    }
                }
                if(!f) ans.add(true);
            }
        }
        return ans;
    }
}