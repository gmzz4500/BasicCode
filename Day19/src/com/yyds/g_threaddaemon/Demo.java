package com.yyds.g_threaddaemon;

public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; true; i++) {
                    System.out.println(Thread.currentThread().getName() + "对女神说晚安~" + i);
                }
            }
        }, "小明: ");
        t1.setDaemon(true);//设置为守护线程
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "我困了,要睡觉了~" + i);
                }
            }
        }, "女神: ");

        t1.start();
        t2.start();

    }
}
