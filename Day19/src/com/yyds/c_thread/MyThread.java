package com.yyds.c_thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("mythread线程打印:HelloWorld" + i );
        }
    }
}
