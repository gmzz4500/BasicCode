package com.yyds.e_data;

import java.util.Date;

/*
       构造方法:
       Date():创建一个Date对象,时间指向创建Date对象的一瞬间!
       Date(long date):创建一个Date对象
       1.时间归零
       2.加上传入的时间毫秒值
       3.定格的时间瞬间 就是这个构造标示顿Date瞬间

       时间操作中看到的long类型,第一反应是 毫秒值! 可以用来计算
 */
public class DateDemo {
    public static void main(String[] args) {
        //Date的无参构造
        Date date = new Date();
        System.out.println("date = " + date);//Fri Mar 04 22:16:48 CST 2022

        //Date的带参构造
        Date date1 = new Date(1000);
        System.out.println("date1 = " + date1);//Thu Jan 01 08:00:01 CST 1970
    }
}
