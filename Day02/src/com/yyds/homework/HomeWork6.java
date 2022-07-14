package com.yyds.homework;

public class HomeWork6 {
    public static void main(String[] args) {
        int today = 2;
//        int day = today + 100 % 7;
        int day = (today + 100) % 7;
        System.out.println("今天是周二");
        System.out.println("100天以后是周" + day);
    }
}
