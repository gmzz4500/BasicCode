package com.yyds.h_threadsafe;

public class SellTicket1 implements Runnable{
    int ticket = 100;
    //创建锁对象
    Object lock = new Object();//被共享
    @Override
    public void run() {

        while (true){
            synchronized(lock){
                if(ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "买了第" + ticket + "张票~");
                    ticket--;
                }
            }
        }

    }
}
