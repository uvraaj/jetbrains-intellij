package com.yuvraj.DSA.patterns;

import java.util.Scanner;

public class Numeric_Palindrome_Equilateral_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input n: ");
        int n = sc.nextInt();

        Numeric_Palindrome_Equilateral_Pyramid(n);
        Asterik_Equilateral_Pyramid(n);
    }
    private static void Asterik_Equilateral_Pyramid(int n) {
        int colEnd = n;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < colEnd; col++) {
                if (col < n - row - 1) {    // this condition is used for printing spaces
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
             colEnd++;  // increasing the value of variable "colEnd" to obtain the desired pattern
            System.out.println();
        }
    }
    private static void Numeric_Palindrome_Equilateral_Pyramid(int n) {
        int colEnd = n;

        for (int row = 0; row < n; row++) {
            int numbers = 1;    // this variable is used to keep the track for which numeric needs to be printed
            for (int col = 0; col < colEnd; col++) {
                if (col < n - row - 1) {    // this condition is used for printing spaces
                    System.out.print(" ");
                }
                else if (col <= n - 1) {  // now printing the numbers AS IT IS until the middle element which is at the index n-1
                    System.out.print(numbers);
                    numbers++;  // increment the number by 1 until if reaches the condition.
                }
                else if (col == n) {    // one element next to the middle element
                    numbers = numbers - 2;  // before completing the loop, number is incremented by 1, thus decrement it by 2 to obtain the desired pattern
                    System.out.print(numbers);
                    numbers--;
                }
                else {  // for the rest of the pattern
                    System.out.print(numbers);
                    numbers--;
                }
            }
            colEnd++;   //increasing the value of variable "colEnd" to obtain the pattern of desired length
            System.out.println();
        }
    }
}
