package org.example.chatgpt.autocloseable;

import java.io.IOException;

public class AutoCloseImpl implements AutoCloseable {

    public void test() {
        try {
            throw new IOException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Its closing the connection");
    }
}
