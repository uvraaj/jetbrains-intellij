package com.yuvraj.DSA.Linked_lists.single;

import java.util.HashMap;

public class detect_loop_in_linked_list {
    public static boolean detect_loop(Node head) {

        if (head == null) return false;

        Node temp = head;
        HashMap<Node,Integer> Nodemap = new HashMap<>();

        while (temp != null) {
            if (Nodemap.containsKey(temp)) { return true; }

            Nodemap.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        if(detect_loop(head)) {
            System.out.println("Loop detected");
        } else {
            System.out.println("Loop not detected");
        }
    }
}
