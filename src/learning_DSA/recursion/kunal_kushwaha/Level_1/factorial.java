package learning_DSA.recursion.kunal_kushwaha.Level_1;

import java.util.Scanner;

public class factorial {
    static long fact(long n) {

        if (n == 1) { return 1; }

        return n * fact(--n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n = in.nextLong();
        System.out.println("factorial of " + n + " is : " +  fact(n));
    }
}
