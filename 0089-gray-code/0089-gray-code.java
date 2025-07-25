class Solution {
    public List<Integer> grayCode(int n) {
        List<String> temp = solve(n);
        System.out.println(temp);
        List<Integer> ans = new ArrayList<>();
        for(String i: temp){
            ans.add(Integer.parseInt(i,2));
        }
        return ans;   
    }

    public ArrayList<String> solve(int n){
        if(n == 1){
            ArrayList<String> base = new ArrayList<>();
            base.add("0");
            base.add("1");
            return base;
        }

        ArrayList<String> base = solve(n - 1);
        ArrayList<String> result = new ArrayList<>();

        for(String i: base){
            result.add("0" + i);
        }

        for(int i = base.size() - 1; i >= 0; i--){
            result.add("1" + base.get(i));
        }

        return result;
    }
}