package org.example.linkedlist;

public class LinkedList {
    static class Node {
        int value;
        Node next = null;

        Node(int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;
    int length = 0;

    public LinkedList(int value) {
        Node node = new Node(value);
        head = tail = node;
        length++;
    }

    public void append(int val) {
        Node newNode = new Node(val);
        if (head == null && tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void printHead() {
        System.out.println(head.value);
    }

    public void printTail() {
        System.out.println(tail.value);
    }
}
