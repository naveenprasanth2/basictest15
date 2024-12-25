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

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        tail = head;
        head = previous;
    }

    private void reverseTillMid() {
        Node next = null;
        Node previous = null;
        Node current = head;
        Node slow = head;
        Node fast = head;

        // Find the midpoint using slow and fast pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the first half of the list
        while (current != slow) {
            next = current.next; // Save the next node
            current.next = previous; // Reverse the link
            previous = current; // Move previous forward
            current = next; // Move current forward
        }

        // Attach the second half of the list to the reversed first half
        if (tail != null) {
            tail.next = slow;
        }

        // Update head for the reversed first half
        head = previous;
    }


    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.addNodeAtEnd(10);
        reverseLinkedList.addNodeAtEnd(20);
        reverseLinkedList.addNodeAtEnd(30);
        System.out.println("Original List:");
        reverseLinkedList.printAll();
        reverseLinkedList.reverseTillMid();
        System.out.println("Reversed Till Midpoint:");
        reverseLinkedList.printAll();
    }
}
