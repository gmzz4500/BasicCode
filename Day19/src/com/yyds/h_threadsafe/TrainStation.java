package com.yyds.h_threadsafe;

public class TrainStation {
    public static void main(String[] args) {
        //创建任务对象
//        SellTicket st = new SellTicket();
//        SellTicket1 st1 = new SellTicket1();
//        SellTicket2 st2 = new SellTicket2();
        SellTicket3 st3 = new SellTicket3();
        //创建3个窗口
        Thread t1 = new Thread(st3, "窗口1: ");
        Thread t2 = new Thread(st3, "窗口2: ");
        Thread t3 = new Thread(st3, "窗口3: ");

        //启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}
