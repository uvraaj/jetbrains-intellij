package learning_DSA.Linked_lists.single;

public class add_1_to_number_without_reversing {

    // Wrapper function
    public static Node add_1_using_recursion(Node head) {
        int carry = add_using_recursion(head);

        // If there is still a carry after the recursion finishes (e.g., 99 -> 100)
        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode; // New head (1)
        }
        return head; // Same head
    }

    // Helper function (Backtracking)
    private static int add_using_recursion(Node temp) {
        // Base Case: When we hit null, we return 1.
        // This represents the "1" we want to add to the last digit.
        if (temp == null) {
            return 1;
        }

        // Recursive Step: Go to the end of the list first
        int carry = add_using_recursion(temp.next);

        // Backtracking: Processing happens as we return from recursion
        temp.data = temp.data + carry;

        if (temp.data < 10) {
            return 0; // Carry handled, propagate 0 upwards
        } else {
            temp.data = 0; // Reset digit (e.g., 10 becomes 0)
            return 1;      // Propagate 1 upwards
        }
    }

    public static void main(String[] args) {
        // Example: Number = 99999
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(9);

        System.out.println("Original List:");
        Node.printLinkedList(head);

        System.out.println("After adding 1:");
        // Result should be 100000
        Node newHead = add_1_using_recursion(head);
        Node.printLinkedList(newHead);
    }
}