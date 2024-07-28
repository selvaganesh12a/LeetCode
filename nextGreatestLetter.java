//this is the answer code to the problem number: 744 in leetCode

import java.util.Scanner;

public class nextGreatestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if(letters[i]>target){
                return letters[i];
            }
        }
        return letters[0];
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("letters = ");
        char[] letters = new char[in.nextInt()];
        System.out.println(", target = ");
        char target = in.next().charAt(0);
        System.out.println(nextGreatestLetter(letters,target));
    }
}
