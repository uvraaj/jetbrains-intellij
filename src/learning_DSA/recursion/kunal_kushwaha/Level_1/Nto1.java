package learning_DSA.recursion.kunal_kushwaha.Level_1;

public class Nto1 {
    public static void main(String[] args) {
        int n = 5;
        print_forward(n);
        System.out.println();
        print_backward(n);
    }
    static void print_forward(int n) {
        if (n == 0) {
            return;
        }
        print_forward(n - 1);
        System.out.print(n + " ");
    }
    static void print_backward(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        print_backward(n - 1);
    }
}
