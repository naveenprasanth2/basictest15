package org.example.binary;

public class BinarySearchTree {
    Node root;

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                } else {
                    temp = temp.left;
                }
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                } else {
                    temp = temp.right;
                }
            }
        }
    }

    public boolean search(int value) {
        if (root == null) return false;
        Node temp = root;

        while (temp != null) {
            if (temp.value == value) return true;
            if (temp.value < value) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        return false;
    }
}
