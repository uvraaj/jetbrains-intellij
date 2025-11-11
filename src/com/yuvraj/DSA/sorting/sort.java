package com.yuvraj.DSA.sorting;

public class sort {
    public static int[] bubble(int[] arr) {
        boolean sorted = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j]) {
                    magic.swap(arr, j, j-1);
                    sorted = false;
                }
            }
            if (sorted) { return arr; }
        }
        return arr;
    }
    public static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last_index = arr.length - i - 1;
            int max_element_index  = magic.get_max_index(arr, 0, last_index);
            magic.swap(arr, max_element_index, last_index);
        }
        return arr;
    }
    public static int[] insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for( int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    magic.swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }
    public static int[] cyclic(int[] arr) {
        int current_index = 0;
        while (current_index < arr.length) {
            int correct_index = arr[current_index] - 1;
             if (arr[current_index] != arr[correct_index]){
                magic.swap(arr, current_index, correct_index);
            } else {
                current_index++;
            }
        }
        return arr;
    }
}
