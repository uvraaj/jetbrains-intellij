package com.yuvraj.DSA.Strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        // Step 1: Convert to lowercase and remove non-alphanumeric characters
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }
        //Step 2: Check if the string is a palindrome
        String filtered_string = filtered.toString();
        String reversed_string = filtered.reverse().toString();

        return filtered_string.equals(reversed_string);
    }
}
