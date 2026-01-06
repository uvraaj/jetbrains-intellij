package learning_DSA.recursion;

import java.util.*;

public class generate_all_binary_strings {
    private static void generate(int length, String temp, List<String> result) {
        //base case
        if (temp.length() == length) {
            result.add(temp);
            return;
        }
        //generating zeroes
        generate(length, temp + '0', result);

        //for non-consecutive ones
//        if (temp.isEmpty() || temp.charAt(temp.length() - 1) != '1') {
//            generate(length, temp + '1', result);
//        }
        //for all binary strings
            generate(length, temp + '1', result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string length : ");
        int n = sc.nextInt();

        List<String> result = new ArrayList<>();

        generate(n, "", result);

        System.out.println("possible binary strings of length" + n + " : ");
        for(String s : result) {
            System.out.print(s + " ");
        }
    }
}
