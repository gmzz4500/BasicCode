package com.yyds.c_thread;

public class Test1 {
    public static void main(String[] args) {
//        MyTarget myTarget = new MyTarget();
//        Thread t = new Thread(myTarget);
//        t.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    System.out.println("线程打印:HelloWorld " + i);
                }
            }
        });
        t2.start();
        for (int i = 1; i < 100; i++) {
            System.out.println("main线程打印:JS " + i);
        }
    }
}
