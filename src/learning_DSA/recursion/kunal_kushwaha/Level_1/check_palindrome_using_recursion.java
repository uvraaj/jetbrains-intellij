package learning_DSA.recursion.kunal_kushwaha.Level_1;

public class check_palindrome_using_recursion {
    public static void main(String[] args) {
        int n = 123454321;

        if (n == reverse_a_number_using_recursion.reverse2(n)) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
}
