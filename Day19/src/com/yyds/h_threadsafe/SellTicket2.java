package com.yyds.h_threadsafe;

public class SellTicket2 implements Runnable{
    //定义票
    static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            //调用方法即可
            this.method();
        }
    }

    public static synchronized void method() {
        if (ticket > 0) {
            //让线程睡一下
            try {
                //让线程放弃CPU的资源
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "买了第" + ticket + "张票~");
            //卖票
            ticket--;
        }
    }
}
