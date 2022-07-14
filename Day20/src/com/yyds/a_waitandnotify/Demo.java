package com.yyds.a_waitandnotify;

public class Demo {
    public static void main(String[] args) {
        //创建包子对象
        BaoZi bz = new BaoZi();
        //创建线程对象
        Customer customer = new Customer("猪八戒",bz);
        Cook cook = new Cook("沙僧",bz);
        //启动线程
        customer.start();
        cook.start();
    }
}
