package learning_DSA.recursion.kunal_kushwaha.Level_1;

public class digitSum {
    static int sum(int n) {
        if (n == 0) { return 0; }

        return (n%10) + sum(n/10);
    }

    public static void main(String[] args) {
        int n = 5102003;
        System.out.println(sum(n));
    }
}
