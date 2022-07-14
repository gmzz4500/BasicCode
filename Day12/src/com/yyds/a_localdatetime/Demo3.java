package com.yyds.a_localdatetime;

import java.time.LocalDateTime;

public class Demo3 {
    public static void main(String[] args) {
        //创建LocalDateTime对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);//现在

        //get系列
        System.out.println("now.getMonth() = " + now.getMonth());//枚举对象
        System.out.println("now.getMonthValue() = " + now.getMonthValue());//整数
        System.out.println("----------------");
        //plus系列
        LocalDateTime newTime = now.plusYears(5);
        System.out.println("now = " + now);
        System.out.println("newTime = " + newTime);
        System.out.println("now.plusMonths(-7) = " + now.plusMonths(-7));
        System.out.println("----------------");
        //minus系列
        LocalDateTime newTime2 = now.minusDays(20);
        System.out.println("newTime2 = " + newTime2);
        System.out.println("-----------------");

        //with系列
        System.out.println("now.withDayOfMonth(31) = " + now.withDayOfMonth(1));
    }
}
