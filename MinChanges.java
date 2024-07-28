//this is the answer code to the problem number:3190 in leetCode

import java.util.Arrays;
import java.util.Scanner;

public class MinChanges {
    public static int minimumOperations(int[] nums) {
        int minop =0;
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if(element%3==1){
                minop+=1;
            }
            else if(element%3==2){
                minop+=1;
            }
        }
        return minop;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("nums = ");
        int[] num = new int[in.nextInt()];
        System.out.println(minimumOperations(num));
    }
}
