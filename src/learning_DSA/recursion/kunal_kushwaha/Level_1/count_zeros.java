package learning_DSA.recursion.kunal_kushwaha.Level_1;

import java.util.Scanner;

public class count_zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.print("number of '0' in "+ n +" is: " + 1);
        } else {
            System.out.print("number of '0' in "+ n +" is: " + count(n));
        }
    }
    private static int count(int n) {
        return helper(n, 0);
    }
    private static int helper(int n, int number_of_zeros) {

        if (n == 0) {return number_of_zeros; }

        int digit = n % 10;
        if (digit == 0) {
            return helper(n/10, number_of_zeros + 1);
        }

        return helper(n/10, number_of_zeros);
    }
}
