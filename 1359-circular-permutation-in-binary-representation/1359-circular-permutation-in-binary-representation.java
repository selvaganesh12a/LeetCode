class Solution {
    public List<Integer> circularPermutation(int n, int start) {
        ArrayList<String> temp = grayCode(n);
        ArrayList<Integer> ans = new ArrayList<>();
        int idx = 0;
        while(Integer.parseInt(temp.get(idx),2) != start){
            idx++;
        }
        for(int i = idx; i < temp.size(); i++){
            ans.add(Integer.parseInt(temp.get(i),2));
        }
        for(int i = 0; i < idx; i++){
            ans.add(Integer.parseInt(temp.get(i),2));
        }
        return ans;
    }

    ArrayList<String> grayCode(int n){
        if(n == 1){
            ArrayList<String> base = new ArrayList<>();
            base.add("0");
            base.add("1");
            return base;
        }

        ArrayList<String> base = grayCode(n - 1);
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