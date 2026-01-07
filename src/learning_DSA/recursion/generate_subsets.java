package learning_DSA.recursion;

import java.util.*;

public class generate_subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size_of_array = sc.nextInt();

        int[] arr = new int[size_of_array];
        for (int i = 0; i < size_of_array; i++) {
            System.out.print("enter the element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        List<Integer> result = new ArrayList<>();
        // Recursion call
        generate_subset_sum(0, 0, arr, result);

        // Increasing order mein mangaa hai, isliye sort karenge
        Collections.sort(result);

        System.out.println("Subset Sums: " + result);
    }

    private static void generate_subset_sum(int index, int curr_sum, int[] arr, List<Integer> result) {
        // Base Case: Agar humne saare elements check kar liye hain
        if (index == arr.length) {
            result.add(curr_sum);
            return;
        }

        // 1. PICK the element: Current element ko sum mein add karo
        generate_subset_sum(index + 1, curr_sum + arr[index], arr, result);

        // 2. DON'T PICK the element: Current element ko skip kar do
        generate_subset_sum(index + 1, curr_sum, arr, result);
    }
}