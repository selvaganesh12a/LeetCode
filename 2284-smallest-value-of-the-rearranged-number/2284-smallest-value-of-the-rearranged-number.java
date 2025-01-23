class Solution {
    public long smallestNumber(long num) {
        if(num == 0){
            return 0;
        }
        ArrayList<Long> list = new ArrayList<>();
        long ans = 0;
        long rep = num;
        while(rep != 0){
            list.add(rep%10);
            rep /= 10;
        }
        if(num > 0){
            Collections.sort(list);
            if(list.get(0) == 0){
                for (int i = 1; i < list.size(); i++) {
                    if(list.get(i) != 0){
                        long temp = list.get(i);
                        list.set(i, 0L);
                        list.set(0,temp);
                        break;
                    }
                }
                for (int i = 0; i < list.size(); i++) {
                    ans = (ans*10) + list.get(i);
                }
                return ans;
            }else{
                for (int i = 0; i < list.size(); i++) {
                    ans = (ans*10) + list.get(i);
                }
                return ans;
            }
        }else{
            Collections.sort(list,(a,b)-> Math.toIntExact(a - b));
            if(list.get(0) == 0){
                for (int i = 1; i < list.size(); i++) {
                    if(list.get(i) != 0){
                        long temp = list.get(i);
                        list.add(i,0l);
                        list.add(0,temp);
                        break;
                    }
                }
            }else{
                for (int i = 0; i < list.size(); i++) {
                    ans = (ans*10) - list.get(i);
                }
                return ans*-1;
            }
        }
        return ans;
    }
}