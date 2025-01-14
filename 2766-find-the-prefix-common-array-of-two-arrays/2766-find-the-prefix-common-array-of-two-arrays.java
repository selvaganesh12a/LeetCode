class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        int idx = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j <= i; j++) {
                map.put(A[j],map.getOrDefault(A[j],0)+1);
                map.put(B[j],map.getOrDefault(B[j],0)+1);
            }
            for (int j = 0; j <= i; j++) {
                if(map.get(A[j]) == 2){
                    count++;
                }
            }
            ans[idx] = count;
            idx++;
            count = 0;
            map.clear();
        }
        return ans;
    }
}