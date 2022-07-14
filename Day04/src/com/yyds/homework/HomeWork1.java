package com.yyds.homework;

import java.util.Random;

/*
* 模拟大乐透号码：
* 一组大乐透号码由10个1-99之间的数字组成
* 打印大乐透号码信息
 */
public class HomeWork1 {
    public static void main(String[] args) {
        //创建随机数对象
        Random r = new Random();
        //产生一组随机数
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = r.nextInt(100) + 1;
        }
        System.out.println("您的大乐透号码为:");
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
