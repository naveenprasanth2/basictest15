package org.example.gpt_challenge;

import java.util.Stack;

public class ValidParenthesis {
    static String closed = ")}]";
    static String open = "({[";

    public static void main(String[] args) {
        String value = "){";


        Stack<Character> stack = new Stack<>();

        char[] values = value.toCharArray();

        for (int i = 0; i < values.length; i++) {
            if (isOpen(values[i]) != -1) {
                stack.push(values[i]);
            } else if (!stack.isEmpty() && isClosed(values[i]) == isOpen(stack.peek())) {
                stack.pop();
            } else {
                System.out.println("Its not a balanced string");
                return;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Its a balanced string");
        } else {
            System.out.println("Its not a balanced string");
        }
    }

    private static int isClosed(char c) {
        return closed.indexOf(c);
    }

    private static int isOpen(char c) {
        return open.indexOf(c);
    }
}
