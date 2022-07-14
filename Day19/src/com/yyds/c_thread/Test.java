package com.yyds.c_thread;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 1; i < 10; i++) {
            System.out.println("main线程打印:Python" + i );
        }
    }
}
