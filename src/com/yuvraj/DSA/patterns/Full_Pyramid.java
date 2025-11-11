package com.yuvraj.DSA.patterns;

import java.util.Scanner;

public class Full_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input n: ");
        int n = sc.nextInt();

        filled(n);
        hollow(n);
        fullPyramid2(n);
        invertedFullPyramid(n);
        diamond(n);
        hollowDiamond(n);

    }
    private static void filled(int n) {
        System.out.println("filled full pyramid");

        for (int row = 0; row < n; row++) {
            int k = 0; //here k is used for keeping the count of stars
            for (int col = 0; col < ((2 * n) - 1); col++) { //2*n-1 will give the total length of the pattern
                if (col < n - row - 1) {
                    System.out.print(" ");
                } else if (k < 2 * row + 1) {
                    System.out.print("*");
                    k++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    private static void hollow(int n) {
        System.out.println("hollow full pyramid");

        for (int row = 0; row < n; row++) {
            int k = 0; //here k is used for counting the number of stars
            for (int col = 0; col < ((2 * n) - 1); col++) {
                if (col < n - row - 1) {
                    System.out.print(" ");
                } else if (k < 2 * row + 1) {
                    if (k == 0 || k == 2 * row || row == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    k++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    private static void fullPyramid2(int n) {
        System.out.println("full pyramid 2");

        for (int row = 0; row < n; row++) {
            int spaces = 0;
            for (int col = 0; col < n; col++) {
                if(spaces < n - row - 1) {
                    System.out.print(" ");
                    spaces++;
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    private static void invertedFullPyramid(int n) {
        System.out.println("inverted full pyramid");

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void diamond(int n) {
        System.out.println("diamond");

        for (int row = 0; row < n; row++) {
            int spaces = 0;
            for (int col = 0; col < n; col++) {
                if(spaces < n - row - 1) {
                    System.out.print(" ");
                    spaces++;
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    private static void hollowDiamond(int n) {
        System.out.println("hollow diamond");

        for (int row = 0; row < n; row++) {
            int k = 0; //here k is used for counting the number of stars
            for (int col = 0; col < ((2 * n) - 1); col++) {
                if (col < n - row - 1) {
                    System.out.print(" ");
                } else if (k < 2 * row + 1) {
                    if (k == 0 || k == 2 * row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    k++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < ((2 * n) - 1); col++) {
                if( col == row || col == 2 * row) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
