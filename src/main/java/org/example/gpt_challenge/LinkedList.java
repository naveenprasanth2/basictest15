package org.example.gpt_challenge;

public class LinkedList {
    Node head;
    Node tail;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private void addNode(int value) {
        Node newNode = new Node(value);
        if (head == null && tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }


    private void reverseList() {
        if (head == null) throw new IndexOutOfBoundsException("No Node found to reverse");
        Node previous = null;
        Node current = head;
        while (current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        Node tempNode = head;
        head = tail;
        tail = tempNode;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.printList();
        list.reverseList();
        list.printList();
    }

    private void printList() {
        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }
}
