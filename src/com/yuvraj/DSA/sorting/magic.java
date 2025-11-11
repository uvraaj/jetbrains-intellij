package com.yuvraj.DSA.sorting;

public class magic {
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static int get_max_index(int[] arr, int start_index, int last_index) {
        int max_element_index = start_index;
        for (int i = start_index; i <= last_index; i++) {
            if (arr[i] > arr[max_element_index]) {
                max_element_index = i;
            }
        }
        return max_element_index;
    }

}
