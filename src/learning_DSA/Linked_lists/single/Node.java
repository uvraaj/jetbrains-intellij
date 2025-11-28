package learning_DSA.Linked_lists.single;

public class Node {
    int data;
    Node next;

    Node (int data, Node next) {
        this.data = data;
        this.next = next;
    }
    Node (int data) {
        this.data = data;
        this.next = null;
    }
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
