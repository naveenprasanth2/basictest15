package org.example.chatgpt.autocloseable;

import java.io.Closeable;
import java.io.IOException;

public class CloseImpl implements Closeable {

    public void test() {
        throw new RuntimeException();
    }

    @Override
    public void close() throws IOException {
        System.out.println("Its closing the connection");
    }
}
