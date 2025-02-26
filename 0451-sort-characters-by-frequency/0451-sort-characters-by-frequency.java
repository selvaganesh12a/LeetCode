class Solution {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : map.values()){
            if(max < i){
                max = i;
            }
            if(!list.contains(i)){
                list.add(i);
            }
        }
        Collections.sort(list,(a,b)->b-a);
        ArrayList<Character> unique = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(!unique.contains(s.charAt(i))){
                unique.add(s.charAt(i));
            }
        }
        for(int i: list){
            for(int j = 0; j < unique.size(); j++){
                if(i == map.get(unique.get(j))){
                    for(int k = 0; k < map.get(unique.get(j)); k++){
                        ans.append(unique.get(j));
                    }
                }
            }
        }
        return ans.toString();
    }
}