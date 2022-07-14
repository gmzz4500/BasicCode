package com.yyds.homework;

import java.util.Scanner;

/*
    从键盘分别输入年、月、日，使用循环for+if实现，判断这一天是当年的第几天
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年:");
        int year = sc.nextInt();
        System.out.println("请输入月:");
        int month = sc.nextInt();
        System.out.println("请输入日:");
        int day = sc.nextInt();
        int days = day;
        for (int i = 1; i < month; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                days += 30;
            } else if (i == 2) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days += 29;
                } else {
                    days += 28;
                }
            } else {
                days += 31;
            }
        }
        System.out.println(year + "年" + month + "月" + day + "日是这一年的第" + days + "天");
    }
}
