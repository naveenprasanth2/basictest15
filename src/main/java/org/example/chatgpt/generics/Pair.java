package org.example.chatgpt.generics;

public class Pair<K, V> {
    private final K k;
    private final V v;

    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getFirst() {
        return k;
    }

    public V getSecond() {
        return v;
    }

    public Pair<V, K> swap() {
        return new Pair<>(this.v, this.k);
    }

    // Static method to compare two pairs
    public static <K extends Comparable<K>, V extends Comparable<V>> int compare(Pair<K, V> pair1, Pair<K, V> pair2) {
        // Compare first values
        int firstComparison = pair1.getFirst().compareTo(pair2.getFirst());

        // If first values are not equal, return the result
        if (firstComparison != 0) {
            return firstComparison;
        }

        // If first values are equal, compare second values
        return pair1.getSecond().compareTo(pair2.getSecond());
    }
}
