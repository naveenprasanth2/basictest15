package org.example.chatgpt.autocloseable;

public class CloseEval {
    public static void main(String[] args) {
        try(CloseImpl autoClose = new CloseImpl()) {
            autoClose.test();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
