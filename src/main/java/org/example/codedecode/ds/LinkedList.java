package org.example.codedecode.ds;

public class LinkedList {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;


    private void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);

        linkedList.print();
    }
}
