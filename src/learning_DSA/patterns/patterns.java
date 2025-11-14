package learning_DSA.patterns;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the count");
        
        int rowCount = sc.nextInt();
    }
    private static void print_half_inverted_pyramid_pattern(int rowCount) {
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < rowCount; col++) {

                if (row == 0 || col == 0 || col == rowCount - row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Half inverted hollow pyramid pattern");
    }

    private static void print_half_inverted_filled_pyramid_pattern(int rowCount) {
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < (rowCount - row - 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Half inverted filled pyramid pattern");
    }
}
