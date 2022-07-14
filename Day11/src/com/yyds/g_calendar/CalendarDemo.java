package com.yyds.g_calendar;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //创建日历对象
        Calendar calendar = Calendar.getInstance();//多态
        //直接创建爱你日历对象指向的时间是什么时候
        System.out.println("calendar = " + calendar);//现在
    }
}
