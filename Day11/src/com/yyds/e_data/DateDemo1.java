package com.yyds.e_data;

import java.util.Date;

/*
    long getTime():获取Date时间所指向的时间瞬间的毫秒值
    void setTime(long time):设置时间
    1.先把时间归零
    2.再把传入的时间毫秒值加到时间原点上
    3.设置新的Date时间

 */
public class DateDemo1 {
    public static void main(String[] args) {
        //创建Date对象
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());//1646403726913
        Date now = new Date();
        System.out.println("now = " + now);//Fri Mar 04 22:23:17 CST 2022

        //获取时间
        System.out.println("now.getTime() = " + now.getTime());//1646403832836

        //设置时间
        now.setTime(0);
        //输出的是东8区的时间原点
        System.out.println("now = " + now);//Thu Jan 01 08:00:00 CST 1970
    }
}
