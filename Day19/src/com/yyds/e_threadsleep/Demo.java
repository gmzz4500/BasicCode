package com.yyds.e_threadsleep;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        //主线程中让主线程执行时睡眠
        for (int i = 1; i <= 60; i++) {
            //让当前线程睡一会
            Thread.sleep(1000);
            System.out.println("时间过了: " + i + "秒");
        }
    }
}
