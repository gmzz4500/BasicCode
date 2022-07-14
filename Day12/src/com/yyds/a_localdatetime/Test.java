package com.yyds.a_localdatetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘录入你的出生日期
        Scanner sc = new Scanner(System.in);
        //分别录入年月日时分秒
        System.out.println("请您输入您的出生年份:");
        int year = sc.nextInt();
        System.out.println("请您输入您的出生月份:");
        int month = sc.nextInt();
        System.out.println("请您输入您的出生日期:");
        int day = sc.nextInt();
        System.out.println("请您输入您的出生小时:");
        int hour = sc.nextInt();
        System.out.println("请您输入您的出生分钟:");
        int minutes = sc.nextInt();
        System.out.println("请您输入您的出生秒:");
        int second = sc.nextInt();

        //创建一个LocalDateTime对象 代表现在
        LocalDateTime now = LocalDateTime.now();
        //创建一个LocalDateTime对象 代表出生日期
        LocalDateTime birthday = LocalDateTime.of(year, month, day, hour, minutes, second);

        //计算时间间隔
        long days = birthday.until(now, ChronoUnit.DAYS);
        System.out.println("人的一生可以活三万多天,您已经活了"+days+"天,请珍爱生命~");


    }
}
