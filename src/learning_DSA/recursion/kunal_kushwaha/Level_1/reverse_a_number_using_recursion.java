package learning_DSA.recursion.kunal_kushwaha.Level_1;

import java.util.Scanner;

public class reverse_a_number_using_recursion {
    static int result = 0;
    static int reverse1(int n) {
        // Base case: when n is 0, stop recursion.
        // Returning 0 here satisfies the method's return type; the reversed value is built in the static 'result'.
        if (n == 0) {
            return n;
        }

        // Get the last digit of the current number.
        int last_digit = n % 10;
        // Shift previously accumulated digits left and add the new last digit.
        result = result * 10 + last_digit;
        // Recurse on the number without its last digit.
        return reverse1(n / 10);
    }
    /**
     * Reverse the digits of a positive integer using recursion and positional math.
     * Returns 0 immediately for input 0 to avoid Math.log10 issues.
     */
    static int reverse2(int n) {
        if (n == 0) {
            return 0;
        }
        // Number of digits in n (e.g. 123 -> 3)
        int total_digits = (int)(Math.log10(n) + 1);
        return helper(n, total_digits);
    }

    /**
     * Helper that places the last digit in its reversed positional place
     * and recurses on the remaining number.
     *
     * @param n current part of the number being processed
     * @param total_digits remaining digit count (position for current last digit)
     * @return partially built reversed number
     */
    private static int helper(int n, int total_digits) {
        // Base case: single digit remaining (already in correct reversed position)
        if (n % 10 == n) {
            return n;
        }

        // Extract last digit
        int last_digit = n % 10;
        // Place last_digit at its reversed position and add recursion result
        return (last_digit * (int)(Math.pow(10, total_digits - 1))) + helper(n / 10, total_digits - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number which needs to be reversed: ");
        int n = in.nextInt();
        reverse1(n);
        System.out.println("using reverse1 " + result);
        System.out.println("using reverse2 " + reverse2(n));
    }
}
