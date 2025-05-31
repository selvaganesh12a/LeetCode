class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> ans = new ArrayList<>();

        ArrayList<String> foods = new ArrayList<>();
        ArrayList<Integer> tables = new ArrayList<>();
        for(List<String> i: orders){
            if(!foods.contains(i.get(2))) foods.add(i.get(2));
            tables.add(Integer.parseInt(i.get(1)));
        }
        Collections.sort(foods);
        Collections.sort(tables);

        ArrayList<String> temp = new ArrayList<>();
        temp.add("Table");
        for(String s : foods) temp.add(s);
        ans.add(temp);

        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(List<String> s : orders){
            if(!map.containsKey(s.get(2))){
                ArrayList<String> c = new ArrayList<>();
                c.add(s.get(1));
                map.put(s.get(2),c);
            }else{
                map.get(s.get(2)).add(s.get(1));
            }
        }

        ArrayList<Integer> table = new ArrayList<>();
        for(int i: tables) if(!table.contains(i)) table.add(i);

        for(int i: table){
            ArrayList<String> t = new ArrayList<>();
            t.add(String.valueOf(i));
            for(String j : foods){
                int count = Collections.frequency(map.get(j),String.valueOf(i));
                t.add(String.valueOf(count));
            }
            ans.add(t);
        }

        return ans;
    }
}