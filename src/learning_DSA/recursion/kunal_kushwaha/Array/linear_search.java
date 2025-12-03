package learning_DSA.recursion.kunal_kushwaha.Array;

import java.util.ArrayList;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2 ,3 , 4 , 4, 5};
        int target = 4;

//        if (find(arr, target, 0)) {
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }
        ArrayList<Integer> ans = find_all_index(arr, target, 0, new ArrayList<>());
        System.out.println(ans);
    }
//    static ArrayList<Integer> list = new ArrayList<>();
    static boolean find(int[] arr, int target, int index) {

        if (index > arr.length - 1) { return false; }

        return arr[index] == target || find(arr, target, index + 1);
    }
    static ArrayList<Integer> find_all_index(int[] arr, int target, int starting_index, ArrayList<Integer> list) {

        if(starting_index == arr.length) { return list; }

        if (arr[starting_index] == target) { list.add(starting_index); }

        return find_all_index(arr, target, starting_index + 1, list);
    }
}
