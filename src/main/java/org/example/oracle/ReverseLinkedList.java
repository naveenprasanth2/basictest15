package org.example.oracle;

public class ReverseLinkedList {
    Node head;
    Node tail;

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private void addNodeAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    private void addNodeAtBeginning(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    private void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    private void reverse() {
        Node next = null;
        Node current = head;
        Node previous = null;

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        tail = head;
        head = previous;
    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.addNodeAtEnd(10);
        reverseLinkedList.addNodeAtEnd(20);
        reverseLinkedList.addNodeAtEnd(30);
        reverseLinkedList.addNodeAtBeginning(90);
        reverseLinkedList.printAll();
        reverseLinkedList.reverse();
        reverseLinkedList.printAll();
    }
}
