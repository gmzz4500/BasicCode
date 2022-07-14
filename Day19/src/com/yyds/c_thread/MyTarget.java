package com.yyds.c_thread;

public class MyTarget implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("MT线程打印:HelloWorld " + i);
        }
    }
}
