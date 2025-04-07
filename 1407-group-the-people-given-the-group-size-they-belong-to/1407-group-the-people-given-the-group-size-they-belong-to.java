class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i : groupSizes) {
            set.add(i);
        }
        for(int i : set){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < groupSizes.length; j++){
                if(i == groupSizes[j]) list.add(j);
            }
            while(list.size() != 0){
                ArrayList<Integer> temp = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    temp.add(list.removeFirst());
                }
                ans.add(temp);
            }
        }
        return ans;
    }
}