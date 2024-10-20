package org.example.chatgpt.autocloseable;

public class CloseEval {
    public static void main(String[] args) {
        try(AutoCloseImpl autoClose = new AutoCloseImpl()) {
            autoClose.test();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
