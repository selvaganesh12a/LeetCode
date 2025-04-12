class Solution {
    public int maxCoins(int[] piles) {
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : piles) list.add(i);
        Collections.sort(list);
        while(!list.isEmpty()){
            int bob = list.getLast();
            list.removeLast();
            ans += list.getLast();
            list.removeLast();
            int alice = list.getFirst();
            list.removeFirst();
        }
        return ans;
    }
}