package org.example.codedecode.challenges;

public class ReverseStringRecursion {
    static {
        builder = new StringBuilder();
    }

    static StringBuilder builder;

    public static void main(String[] args) {
        String name = "naveen";
        recurse(name);
        System.out.println(builder);
    }

    private static void recurse(String name) {
        if (name.length() <= 1) {
            builder.append(name);
            return;
        }
        builder.append(name.charAt(name.length() - 1));
        recurse(name.substring(0, name.length() - 1));
    }
}
