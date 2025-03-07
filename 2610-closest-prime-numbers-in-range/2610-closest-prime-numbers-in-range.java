class Solution {
    public int[] closestPrimes(int left, int right) {
        int idx = 0;
        int[] ans = new int[2];
        boolean[] isprimes = new boolean[right + 1];
        Arrays.fill(isprimes,true);
        isprimes[0] = false;
        isprimes[1] = false;
        for (int i = 2; i*i <= right; i++) {
            if(isprimes[i]){
                for (int j = i*i; j <= right ; j+=i) {
                    isprimes[j] = false;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < isprimes.length; i++) {
            if((i >= left) && isprimes[i]) list.add(i);
        }
        int diff = Integer.MAX_VALUE;
        if(list.size() > 1){
            for (int i = 0; i < list.size() - 1; i++) {
                int f = list.get(i);
                int s = list.get(i+1);
                if((f >= left) && (s - f) < diff){
                    diff = s - f;
                    ans[0] = f;
                    ans[1] = s;
                }
            }
            return ans;
        }else{
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
    }
}