package learning_DSA.patterns;

import java.util.Scanner;

public class Fancy_Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input n: ");
        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < (2 * n - 1) + (2 * n - 2); col++) {
                if (col < 2 * n - 2) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
