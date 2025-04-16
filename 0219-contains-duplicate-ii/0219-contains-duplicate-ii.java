class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }else{
                map.get(nums[i]).add(i);
            }
        }

        for(int i : map.keySet()){
            if(map.get(i).size() >= 2){
                for(int j = 0; j < map.get(i).size() - 1; j++){
                    if(Math.abs(map.get(i).get(j) - map.get(i).get(j+1)) <= k) return true;
                }
            }
        }
        return false;
    }
}