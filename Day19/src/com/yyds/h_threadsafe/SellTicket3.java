package com.yyds.h_threadsafe;

import java.util.concurrent.locks.ReentrantLock;

public class SellTicket3 implements Runnable{
    //定义票
    int ticket = 100;
    //创建锁对象
    ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            //上锁
            lock.lock();
            if (ticket > 0){
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
            //解锁
            lock.unlock();
        }
    }
}
