package com.yyds.h_threadsafe;

public class SellTicket implements Runnable{

    //定义票
    int ticket = 1;
    @Override
    public void run() {
        while (true){//死循环,车站不关门

            if (ticket <= 100){
                //让线程睡一下
                try {
                    //让线程放弃CPU的资源
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "卖了第" + ticket + "张票~");
                //卖票
                ticket++;
            }
        }
    }
}
