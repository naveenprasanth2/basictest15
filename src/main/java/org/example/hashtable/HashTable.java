package org.example.hashtable;

import static java.lang.StringTemplate.STR;

public class HashTable {
    private static final int SIZE = 7;
    private Node[] dataMap;


    static class Node {
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[SIZE];
    }

    private int hashcode(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int asciiValue : keyChars) {
            hash = (hash + (asciiValue * 23)) % dataMap.length;
        }
        return hash;
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[0];
            System.out.println(STR."The value of index is \{i}");
            while (temp != null) {
                System.out.println(STR."The key is \{temp.key} and the value is \{temp.value}");
                temp = temp.next;
            }
        }
    }
}
