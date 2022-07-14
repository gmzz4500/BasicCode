package com.yyds.f_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        //创建Date对象
        Date now = new Date();//现在
        System.out.println("now = " + now);//Fri Mar 04 22:35:15 CST 2022

        //对date的展示内容进行格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化操作
        String format = sdf.format(now);
        System.out.println("format = " + format);//2022-03-04 22:38:44
    }
}
