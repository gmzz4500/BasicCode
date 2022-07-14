package com.yyds.a_localdatetime;

import java.time.LocalDateTime;

public class Demo1 {
    public static void main(String[] args) {
        //创建一个现在时间
        LocalDateTime now = LocalDateTime.now();
//        date.toString() + 'T' + time.toString();
        System.out.println("now = " + now.toString());//now = 2022-03-09T20:03:35.672

        //创建任意时间
        LocalDateTime of = LocalDateTime.of(2008, 8, 8, 8, 8, 8);
        System.out.println("of = " + of);
    }

}
