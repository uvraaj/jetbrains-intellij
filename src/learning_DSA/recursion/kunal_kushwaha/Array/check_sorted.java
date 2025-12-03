package learning_DSA.recursion.kunal_kushwaha.Array;

import java.util.Scanner;

public class check_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " integer values: ");
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + " --> ");
            arr[i] = sc.nextInt();
        }

        if (checking_sorted(arr, 0)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
    private static boolean checking_sorted(int[] arr, int index) {
        // base condition
        if (index == arr.length -1) { return true; }

        return arr[index] < arr[index + 1] && checking_sorted(arr, index + 1);
    }
}
