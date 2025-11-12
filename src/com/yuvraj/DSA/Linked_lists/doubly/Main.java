package com.yuvraj.DSA.Linked_lists.doubly;

public  class Main{
    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            Node head = convert_arr2DLL(arr);
            print_DLL(head);
            print_DLL(head);
    }
    private static Node convert_arr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], prev, null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    private static void print_DLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
    }
}
