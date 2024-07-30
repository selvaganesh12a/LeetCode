class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int startIndex=0;
        int endIndex=arr.length-1;
        while(startIndex<endIndex)
        {
            int midIndex=startIndex+(endIndex-startIndex)/2;
            if(arr[midIndex]>arr[midIndex+1])
            {
                endIndex=midIndex;
            }
            else if(arr[midIndex]<arr[midIndex+1])
            {
                startIndex=midIndex+1;
            }
        }
        
    return startIndex;
    }
}