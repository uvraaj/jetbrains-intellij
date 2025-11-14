package learning_DSA.Strings;

import java.util.*;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input string: ");
        System.out.println(check_Palindrome(sc.nextLine()));
    }

    static boolean check_Palindrome(String input) {
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            int start = input.charAt(i);
            int end = input.charAt(input.length() - 1 - i);

            if(start != end) {
                return false;
            }
        }
        return true;
    }
}
