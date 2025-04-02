class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        if(n == 1) ans.add(String.valueOf(nums[0]));
        int t = 0;
        for(int i = 0; i < n-1; i++){
            int temp = nums[i];
            int k = 0;
            int j = i;
            while(j < n - 1 && nums[j]+1 == nums[j+1]){
                k = nums[j+1];
                j++;
            }
            if(nums[i] + 1 != nums[i+1]) k = temp;
            if(k == temp) ans.add(String.valueOf(k));
            else{
                String st = String.valueOf(temp);
                st += "->";
                st += String.valueOf(k);
                ans.add(st);
            }
            i = j;
            t = i;
        }
        if(t == n - 2) ans.add(String.valueOf(nums[n - 1]));
        return ans;
    }
}