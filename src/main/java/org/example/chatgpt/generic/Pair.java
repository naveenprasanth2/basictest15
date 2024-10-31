package org.example.chatgpt.generic;

public class Pair<K, V> {
    K k;
    V v;

    Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getKey() {
        return k;
    }

    public V getValue() {
        return v;
    }

    public Pair<V, K> swap() {
        if (this.k instanceof Number && this.v instanceof Number) {
            return new Pair<>(v, k);
        } else {
            throw new ClassCastException();
        }
    }

    public void setKey(K k) {
        this.k = k;
    }

    public void setValue(V v) {
        this.v = v;
    }

    // Method with K, V as inputs and S as a return type
    public <K extends Number, V extends Number, S extends Number> S addKeysAndValue(Pair<K, V> pair, Class<S> returnType) {
        Number keyNum = pair.getKey();
        Number valueNum = pair.getValue();

        // Adding key and value as double
        double sum = keyNum.doubleValue() + valueNum.doubleValue();

        // Converting the sum to the desired return type S
        if (returnType == Integer.class) {
            return returnType.cast((int) sum);
        } else if (returnType == Double.class) {
            return returnType.cast(sum);
        } else if (returnType == Float.class) {
            return returnType.cast((float) sum);
        } else {
            throw new IllegalArgumentException("Unsupported return type: " + returnType.getName());
        }
    }

}
