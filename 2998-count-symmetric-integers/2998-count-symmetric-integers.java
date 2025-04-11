class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for(int i = low; i <= high; i++){
            int len = 0,temp = i;
            ArrayList<Integer> list = new ArrayList<>();
            while(temp > 0){
                len++;
                list.add(temp % 10);
                temp /= 10;
            }
            if(len%2 == 0){
                int f = 0;
                for(int j = 0; j < len / 2; j++) f += list.get(j);
                int s = 0;
                for(int j = len - 1; j >= len / 2; j--) s += list.get(j);
                if(f == s) ans++;
            }
        }
        return ans;
    }
}