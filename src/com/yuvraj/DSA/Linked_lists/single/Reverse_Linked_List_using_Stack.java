package com.yuvraj.DSA.Linked_lists.single;

import java.util.*;

public class Reverse_Linked_List_using_Stack {
    public  static Node reverseLinkedListUsingStack(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node current = head;

        //step1: pushing everything into the stack in an order
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }
        current = head;
        //step2: popping everything back to linked list from stack
        while (!stack.isEmpty()) {
            current.data = stack.pop();
            current = current.next;
        }
        return head;
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
        Node newhead = reverseLinkedListUsingStack(head);
        printLinkedList(newhead);
    }
}
