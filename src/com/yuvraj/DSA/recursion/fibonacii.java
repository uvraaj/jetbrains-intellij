package com.yuvraj.DSA.recursion;
import java.util.*;

public class fibonacii {
    static int fibo(int n) {
//        if (n == 0) return 0;
//        if (n == 1) return 1;
        if (n < 2) { return n; }
        if (n < 0) {
            System.out.println("Fibonacci does not exit for negative numbers");
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = sc.nextInt();
        int result = fibo(input);

        System.out.println("Fibonacci of " + input + " is " + result);
    }
}
