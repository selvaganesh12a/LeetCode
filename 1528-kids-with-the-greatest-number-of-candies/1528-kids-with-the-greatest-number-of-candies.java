class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean [] ans = new Boolean[candies.length];
        int max = 0;

        for(int i : candies ){
            if(i>max){
                max = i;
            }
        }

        for(int i = 0; i < candies.length; i++){
            if((candies[i] + extraCandies) >= max){
                ans[i] = true;
            }else{
                ans[i] = false;
            }
        }

        return Arrays.asList(ans);
    }
}