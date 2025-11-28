package learning_DSA.Linked_lists.single;

public class add_1_to_number {
    public static Node add_one_to_number(Node head) {

        // Step 1: Reverse the linked list.
        // We do this to access the Least Significant Bit (last digit) first,
        // effectively making it the "head" of our processing.
        head = reverse_linked_list_recursively.reverseLinkedListRecursive(head);

        Node temp = head;
        int carry = 1; // Start with a carry of 1 because we want to add 1 to the number

        // Step 2: Traverse the reversed list and propagate the carry
        while (temp != null) {
            temp.data += carry; // Add the carry to the current node's data

            if (temp.data < 10) {
                // If the sum is less than 10 (e.g., 4+1=5 or 8+1=9),
                // there is no further carry to propagate.
                carry = 0;
                break; // Optimization: Stop processing as no other digits will change
            }
            else {
                // If the sum is 10 (e.g., 9+1=10), we set the current digit to 0
                // and keep the carry as 1 to add to the next node.
                temp.data = 0;
                carry = 1;
            }
            temp = temp.next; // Move to the next digit
        }

        // Step 3: Handle the edge case where the number grows in size (e.g., 999 -> 1000).
        // If the loop finishes and we still have a carry of 1, it means the MSB overflowed.
        if (carry == 1) {
            Node newNode = new Node(1);

            // Since the list is currently reversed (e.g., 0->0->0),
            // attaching 1 at the front gives us 1->0->0->0 (1000).
            // This is the correct order, so we can return immediately.
            newNode.next = head;
            return newNode;
        }

        // Step 4: If no new digit was added, reverse the list back to its original order.
        head = reverse_linked_list_recursively.reverseLinkedListRecursive(head);

        return head;
    }

    public static void main(String[] args) {
        // Example: Number = 99999
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(9);

        // Result should be 100000
        Node.printLinkedList(add_one_to_number(head));
    }
}