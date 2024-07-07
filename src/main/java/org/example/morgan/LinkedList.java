package org.example.morgan;

public class LinkedList {
    Node head;

    class Node {
        int value;
        Node next;
    }

    //input 1-> 2-> 3-> 4-> 5
    //op 1, 2, 4, 5

    // remove me in constant time
    private void removeMe(Node poisionNode) {
        //poisionNode.val = 3 ( to be removed ), poisionNode.next.val = 4
        //secondNode -> last -1
        Node currentNode = poisionNode;

        currentNode.value = currentNode.next.value;
        currentNode.next = currentNode.next.next;


    }

    private void timeComplexity() {
        //time complexity O(n)
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello World");
        }
        //n = unknown O(n/3) -> n = (1/3k) -> k -> log3n
        //n = 100/3 -> 33 -> 11 -> 3 -> 1 -> 0
        //n =
//        for (int i = 'n'; 'n' > 0; 'n' /= 3) {
//            System.out.println("Hello World");
//        }
    }

}
