package com.yyds.homework.homework5;

import java.net.Socket;

public class MyThread extends Thread{
    private Socket socket;

    public MyThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
    }
}
