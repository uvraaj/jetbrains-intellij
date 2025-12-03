package learning_DSA.recursion.kunal_kushwaha.Array;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3 , 4 , 5};
        int target = 14;

        if (find(arr, target, 0)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    static boolean find(int[] arr, int target, int index) {

        if (index > arr.length - 1) { return false; }

        return arr[index] == target || find(arr, target, index + 1);
    }
}
