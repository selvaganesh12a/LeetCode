class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        HashMap<Integer,Integer> rank = new HashMap<>();
        int idx = 1;
        for (int i = 0; i < arr.length; i++) {
            if(!rank.containsKey(temp[i])){
                rank.put(temp[i],idx);
                idx+=1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rank.get(arr[i]);
        }
        return arr;
    }
}