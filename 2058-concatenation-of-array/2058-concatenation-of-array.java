import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
                ans[i] = nums[i];
                ans[i + nums.length] = nums[i];
        }
        return ans;
    }

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            int[] num = new int[in.nextInt()];
            System.out.println(Arrays.toString(getConcatenation(num)));
        }
    }