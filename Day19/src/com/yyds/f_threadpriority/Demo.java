package com.yyds.f_threadpriority;

public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "执行了 " + i);
                }
            }
        }, "汽车");
        t1.setPriority(1);

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "执行了 " + i);
                }
            }
        }, "火车");
        t2.setPriority(5);
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "执行了 " + i);
                }
            }
        }, "飞机");
        t2.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
    }
}
