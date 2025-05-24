class Solution {
    public static int minimumPushes(String word) {
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        int ans = 0;
        for(char c: word.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
            if(!list.contains(c)) list.add(c);
        }
        Collections.sort(list, (a, b) -> map.get(b).compareTo(map.get(a)));
        int count = 1;
        if(list.size() > 8){
            while(list.size() != 0) {
                int i = 0;
                while (i < 8 && list.size() >= 1) {
                    ans += map.get(list.get(0)) * count;
                    list.remove(0);
                    i++;
                }
                count++;
            }
        }else{
            for(int i = 0; i < list.size();i++) ans += map.get(list.get(i));
        }
        return ans;
    }
}