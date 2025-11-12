package com.yuvraj.DSA.Linked_lists.single;

public class Reverse_Linked_Lists_in_Place {
    public static Node reverseLinkedListInPlace(Node head) {

        if (head == null || head.next == null) return head;

        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
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

        System.out.println("original linked list");
        printLinkedList(head);

        System.out.println("reversed linked list");
        Node newhead = reverseLinkedListInPlace(head);
        printLinkedList(newhead);
    }
}
