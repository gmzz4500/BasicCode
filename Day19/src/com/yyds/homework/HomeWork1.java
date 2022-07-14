package com.yyds.homework;

public class HomeWork1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println("main主线程-->"+ i + "\t");
                    }else {
                        System.out.println(Thread.currentThread().getName()+ "-->" + i + "\t");
                    }
                }
            }
        }, "子线程");
        t1.start();

        //设置主线程的名字
        Thread.currentThread().setName("main主线程:");
    }
}
