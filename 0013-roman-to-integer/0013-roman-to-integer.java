class Solution {
    public int romanToInt(String s) {
       int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('M', 7);
        map.put('D',6);
        map.put('C',5);
        map.put('L',4);
        map.put('X',3);
        map.put('V',2);
        map.put('I',1);
        HashMap<Character,Integer> val = new HashMap<>();
        val.put('M',1000);
        val.put('D',500);
        val.put('C',100);
        val.put('L',50);
        val.put('X',10);
        val.put('V',5);
        val.put('I',1);
        StringBuilder q = new StringBuilder(s);
        while(q.length() > 0){
            char c = q.charAt(q.length() - 1);
            if(q.length() > 1 && map.get(c) > map.get(q.charAt(q.length() - 2))){
                ans = ans + (val.get(c) - val.get(q.charAt(q.length() - 2)));
                q.deleteCharAt(q.length() - 1);
                q.deleteCharAt(q.length() - 1);
            }else{
                ans = ans + val.get(c);
                q.deleteCharAt(q.length() - 1);
            }
        }
        return ans; 
    }
}