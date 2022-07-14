package com.yyds.c_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个FutureTask对象
        FutureTask<String> sft = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                //写线程任务
                for (int i = 1; i <= 100; i++) {
                    System.out.println("小明对女神说" + i + "次 我爱你~");
                }
                return "女神说 滚~";
            }
        });
        Thread t = new Thread(sft);
        t.start();
        for (int i = 1; i <= 100; i++) {
            System.out.println("PHP " + i);
        }
        System.out.println("sft.get() = " + sft.get());
    }
}
