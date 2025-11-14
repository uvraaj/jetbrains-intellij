package learning_DSA.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,5,7,2,1,6,8,12,32,4,2,532,4};
        int[] arr2 = {5,4,3,1,2,6,9,7,8};
//        sort.insertion(arr);
        sort.cyclic(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
