package com.yuvraj.DSA.Linked_lists.single;

import java.util.HashMap;

public class length_Of_Loop {
    public static int length_of_loop_using_hashmap(Node head) {

        Node temp = head;
        HashMap<Node, Integer> nodeMap = new HashMap<>();
        int counter = 0;

        while (temp != null) {
            if (nodeMap.containsKey(temp)) {
                return counter - nodeMap.get(temp);
            }
            nodeMap.put(temp, counter++);
            temp = temp.next;
        }
        return 0;
    }
    public static int length_of_loop_using_slow_and_fast_pointers(Node head) {
        Node slow = head;
        Node fast = head;
        int counter = 1;
        //step1: detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                //loop detected
                //step2: find length
                slow = slow.next;
                while (slow != fast) {
                    slow = slow.next;
                    counter++;
                }
                return counter;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Linking the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Creating a loop from fifth to second
        fifth.next = second;

        System.out.println("length of loop inside a linked list is: " + length_of_loop_using_hashmap(head));
        System.out.println("length of loop inside a linked list is: " + length_of_loop_using_slow_and_fast_pointers(head));
    }
}
