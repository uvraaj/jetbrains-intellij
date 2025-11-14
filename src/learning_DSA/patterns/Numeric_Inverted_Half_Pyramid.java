package learning_DSA.patterns;

import java.util.Scanner;

public class Numeric_Inverted_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input n: ");
        int n = sc.nextInt();

        hollow(n);
        System.out.println();
        filled(n);
    }

    private static void hollow(int n) {
        System.out.println("hollow numeric inverted half pyramid");
        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col <= n; col++) {
                if (col == row + 1 || col == n || row == 0) {
                    System.out.print(col);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    private static void filled(int n) {
        System.out.println("filled numeric inverted half pyramid");
        for (int row = 0; row < n; row++) {
            for (int col = row+1; col <= n; col++) {
                    System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
