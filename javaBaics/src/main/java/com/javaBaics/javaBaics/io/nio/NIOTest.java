package com.javaBaics.javaBaics.io.nio;

import java.io.IOException;

public class NIOTest {
    public static void main(String[] args) throws IOException {
        int port = 8888;

        NIOService nioService = new NIOService(port);
        nioService.listen();

        NIOClient nioClient = new NIOClient();

    }
}
