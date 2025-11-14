package learning_DSA.recursion.kunal_kushwaha.Level_1;

public class sum {
    static int SUM(int n) {
        if (n == 1) {
            return 1;
        }
        return n + SUM(n - 1);
    }

    public static void main(String[] args) {
        int n = 51;
        System.out.println(SUM(n));
    }
}
