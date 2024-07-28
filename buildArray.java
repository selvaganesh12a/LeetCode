//this is the answer code to the problem number: 1920 in leetCode

package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class buildArray {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=ans[nums[nums[i]]];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] num = new int[in.nextInt()];
        System.out.println(Arrays.toString(buildArray(num)));
    }
}
