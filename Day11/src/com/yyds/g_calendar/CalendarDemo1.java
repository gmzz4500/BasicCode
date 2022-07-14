package com.yyds.g_calendar;

import java.util.Calendar;

public class CalendarDemo1 {
    public static void main(String[] args) {
        //创建日历对象
        Calendar calendar = Calendar.getInstance();//现在
        //获取日历信息
//        System.out.println("calendar.get(1) = " + calendar.get(1));//year
        System.out.println("calendar.get(Calendar.YEAR) = " + calendar.get(Calendar.YEAR));
        System.out.println("calendar.get(Calendar.MONTH) = " + calendar.get(Calendar.MONTH));
        System.out.println("calendar.get(Calendar.DAY_OF_MONTH) = " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("calendar.get(Calendar.DAY_OF_WEEK) = " + calendar.get(Calendar.DAY_OF_WEEK));

        //设置日历信息 -> 在原有的Calendar对象上进行修改

        calendar.set(Calendar.YEAR,1996);
        calendar.set(Calendar.MONTH,4);
        calendar.set(Calendar.DAY_OF_MONTH,17);

        System.out.println("calendar = " + calendar);
        calendar.set(1996,3,17,8,8,8);
    }
}
