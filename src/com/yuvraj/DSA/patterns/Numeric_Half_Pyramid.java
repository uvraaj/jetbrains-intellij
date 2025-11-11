package com.yuvraj.DSA.patterns;

import java.util.Scanner;

public class Numeric_Half_Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("input n: ");
        int n = sc.nextInt();

        hollow(n);
        filled(n);
    }

    private static void hollow(int n) {
        System.out.println("hollow numeric half pyramid");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                if (col == row || col == 0 || row == n-1) {
                    System.out.print(col+1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void filled(int n) {
        System.out.println("filled numeric half pyramid");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                    System.out.print(col+1);
            }
            System.out.println();
        }
    }
}
