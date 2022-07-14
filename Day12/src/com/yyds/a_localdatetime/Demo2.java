package com.yyds.a_localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
    LocalDateTime的格式化和解析
 */
public class Demo2 {
    public static void main(String[] args) {
        //解析
        String strTime = "1996年04月17日 08:08:08";
        //创建日期格式对象
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        
        //静态方法直接调用
        LocalDateTime localDateTime = LocalDateTime.parse(strTime, formatter);
        System.out.println("localDateTime = " + localDateTime);

        System.out.println("=================");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //格式化
        String format = localDateTime.format(formatter1);
        System.out.println("format = " + format);
    }
}
