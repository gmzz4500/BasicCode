package com.yyds.d_threadname;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //第一种方式创建线程对象
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(getName() + "Java " + i);
                }
            }
        };
        //给线程取名字
        t1.setName("线程1: ");

        //第二种方式创建线程对象
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "JS " + i);
                }
            }
        }, "线程2: ");

        //第三种方式创建线程对象
        FutureTask<String> sft = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "PHP " + i);
                }
                return "PHP是世界上最好的语言";
            }
        });
        Thread t3 = new Thread(sft);
        t3.setName("线程3: ");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("sft.get() = " + sft.get());



        //给主线程取名字
        Thread.currentThread().setName("主线程: ");

        //main线程
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "Python " + i);
        }
    }
}
