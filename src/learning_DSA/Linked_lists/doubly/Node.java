package learning_DSA.Linked_lists.doubly;

public class Node {
        int data;
        Node prev;
        Node next;

        Node (int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
        Node (int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
