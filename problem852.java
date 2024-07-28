import java.util.Scanner;

public class problem852 {
    // answer without using binary search concept
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end=1;
        while(true){
            if(arr[start]>arr[end]){
                return start;
            }
            start+=1;
            end+=1;
        }
    }
    //answer with binary search concept
    public static int peakMountain(int[] arr){
        int s=0;
        int f= arr.length-1;
        while(s<=f){
            int mid = s+(f-s)/2;
            if(arr[mid]>arr[mid+1]){
                f=mid;
            } else if (arr[mid]<arr[mid=1]) {
                s=mid+1;
            }
        }
        return s;
    }
}
