package com.yyds.g_calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Test1 {
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
        //创建Calendar对象
        Calendar calendar = Calendar.getInstance();//现在
        //设置日历对象的时间
        calendar.set(year, month - 1, day, hour, minutes, second);

        //Calendar --> long
        long birthDateTime = calendar.getTimeInMillis();
        //获取现在的时间毫秒值
        long nowTime = System.currentTimeMillis();
        //计算
        long days = (nowTime - birthDateTime) / (1000 * 60 * 60 * 24);
        System.out.println("人的一生可以活三万多天,您已经活了" + days+"天,请珍爱生命~");
    }
}
