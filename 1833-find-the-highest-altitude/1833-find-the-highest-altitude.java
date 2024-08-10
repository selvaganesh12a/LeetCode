class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int high = 0;
        for(int i = 0; i < gain.length; i++){
            int temp = gain[i];
            altitude += temp;
            if(high < altitude){
                high = altitude;
            }
        }
        return high;
    }
}