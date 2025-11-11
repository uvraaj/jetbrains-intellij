package com.yuvraj.DSA.patterns;

import java.util.Scanner;

public class Floyds_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input n: ");
        int n = sc.nextInt();

        int numeric = 1;    // this variable is used to store the values of numeric which is used to obtain the desired pattern

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(numeric + " ");
                numeric++;
            }
            System.out.println();
        }
    }
}
