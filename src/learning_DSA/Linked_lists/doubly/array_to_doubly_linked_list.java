package learning_DSA.Linked_lists.doubly;

// Simple utility to convert an array into a doubly linked list and print it.
//
// Note: This file expects a `Node` class somewhere in the project with the
// following shape (or equivalent constructors/fields):
//   int data;
//   Node prev;
//   Node next;
//   Node(int data) { ... }
//   Node(int data, Node prev, Node next) { ... }
// Keeping methods small and focused: construct list, then print it.
public class array_to_doubly_linked_list {
    public static void main(String[] args) {
        // sample input array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // convert array to doubly linked list and obtain head node
        Node head = convert_arr2DLL(arr);

        // print list forward twice (second call demonstrates list reuse)
        print_DLL(head);
        print_DLL(head);
    }

    // Convert a non-empty integer array into a doubly linked list.
    // Returns the head of the constructed list.
    private static Node convert_arr2DLL(int[] arr) {
        // create head node from first element
        Node head = new Node(arr[0]);
        Node prev = head;

        // iterate remaining elements and link nodes bidirectionally
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], prev, null); // prev becomes previous pointer
            prev.next = temp;                          // link previous next to current
            prev = temp;                               // advance prev pointer
        }
        return head;
    }

    // Print the doubly linked list from head to tail using " <-> " between nodes.
    private static void print_DLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
    }
}