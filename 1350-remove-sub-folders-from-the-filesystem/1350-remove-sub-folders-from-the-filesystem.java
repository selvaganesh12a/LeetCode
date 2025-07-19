class Solution {
    public List<String> removeSubfolders(String[] folder) {
        ArrayList<String> ans = new ArrayList<>();
        Arrays.sort(folder);
        ans.add(folder[0]);
        int k =0;
        for(String i: folder){
            if(k==0){
                k++;continue;
            }
            if(!i.startsWith(ans.get(ans.size() - 1) + "/")) ans.add(i);
        }
        return ans;
    }
}