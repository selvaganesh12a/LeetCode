class Solution {
    public int countLargestGroup(int n) {
        int ans = 0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 1; i <= n; i++){
            int a = i,sum = 0;
            while(a > 0){
                sum += a%10;
                a /= 10;
            }
            if(!map.containsKey(i)){
                ArrayList<Integer> list = new ArrayList<>();
                map.put(i,list);
            }
            map.get(sum).add(i);
        }
        int max = 0;
        for(int i : map.keySet()){
            max = Math.max(max,map.get(i).size());
        }
        for(int i : map.keySet()){
            if(map.get(i).size() == max) ans++;
        }
        return ans;
    }
}