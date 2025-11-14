package learning_DSA.patterns;

import java.util.Scanner;

public class Hollow_Half_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input n: ");
        int n = sc.nextInt();

        for (int row = 0; row < 2 * n - 1; row++) { // 2 * n - 1 will give the length of the pattern
            int colEnd = 0;

            if (row < n) {  //upperPart
                colEnd = row;   // for the upper part of the pattern loop will iterate upto index = row
            }
            else {  //lowerPart
                colEnd = n - (row % n) - 2; // this condition will give the index upto which loop will iterate to which column
            }

            /*
             **** ALTER *****
             int colEnd = row < n ? row : n - (row % n) - 2
            */
            for (int col = 0; col <= colEnd; col++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
