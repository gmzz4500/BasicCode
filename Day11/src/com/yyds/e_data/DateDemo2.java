package com.yyds.e_data;

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("now = " + now);//Fri Mar 04 22:31:58 CST 2022
        System.out.println("now.toLocaleString() = " + now.toLocaleString());//2022-3-4 22:31:58
        System.out.println("now.toGMTString() = " + now.toGMTString());//4 Mar 2022 14:31:58 GMT
    }
}
