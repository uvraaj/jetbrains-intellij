package learning_DSA.Linked_lists.single;

import java.util.Stack;

public class check_palindrome_using_stack {
    public static boolean isPalindrome(Node head) {
        Node temp = head;
        Stack<Integer> nodeStack = new Stack<Integer>();

         //step1: pushing data into the stack
        while (temp != null) {
            nodeStack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.data != nodeStack.peek()) { return false; }
            temp = temp.next;
            nodeStack.pop();
        }
        return true;
    }
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create a linked list with
        // values 1, 5, 2, 5, and 1 (15251, a palindrome)
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Check if the linked list is a palindrome
        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
