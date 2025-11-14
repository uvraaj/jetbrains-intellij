package learning_DSA.recursion;

public class binary_search_using_recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        System.out.println("target value " + target + " is at index " + search(arr, target, 0, arr.length-1));
    }
    static int search(int[] arr, int target, int start, int end) {
        if (start > end) { return -1; }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) { return mid; }
        if (arr[mid] > target) { return search(arr, target, start, mid-1); }
        if (arr[mid] < target) { return search(arr, target, mid+1, end); }

        return -1;
    }
}
