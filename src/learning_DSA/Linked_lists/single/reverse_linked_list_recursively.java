package learning_DSA.Linked_lists.single;

public class reverse_linked_list_recursively {

    public static Node reverseLinkedListRecursive(Node head) {
        // 1. Base case: If head is empty or reached end
        if (head == null || head.next == null) {
            return head;
        }

        // 2. Recursive Hypothesis: Reverse the rest of the list
        Node newHead = reverseLinkedListRecursive(head.next);

        // 3. Induction: Change the pointers
        Node front = head.next; // 'front' is the node ahead of current
        front.next = head;      // Make 'front' point back to 'head'
        head.next = null;       // Break the link from 'head' to 'front'

        return newHead;         // Return the new head (which was the original tail)
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
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original linked list:");
        printLinkedList(head);

        System.out.println("Reversed linked list (Recursive):");
        Node newhead = reverseLinkedListRecursive(head);
        printLinkedList(newhead);
    }
}
