package com.yuvraj.DSA.patterns;

import java.util.Scanner;

public class Pascals_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input n: ");

        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            int counter = 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(counter + " ");
                counter = counter * (row - col) / col;  // you have to remember this condition
            }
            System.out.println();
        }
    }
}
