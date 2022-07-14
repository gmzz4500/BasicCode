package com.yyds.homework;

import java.util.Scanner;

/*
    已知2019年1月1日是星期二，从键盘输入2019年的任意一天，请判断它是星期几
 */
public class HomeWork7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入月份:");
        int month = sc.nextInt();
        System.out.print("请输入日期:");
        int day = sc.nextInt();
        int week = 2;
        int days = 1;
        switch (month) {
            case 1:
                days = day;
                week = (week + days - 1) % 7;
                if(week==0){
                    week = '天';
                    System.out.println(month + "月" + day + "日是星期天");
                }else{
                    System.out.println(month + "月" + day + "日是星期" + week);
                }
                break;
            case 2:
                days = day + 31;
                week = (week + days - 1) % 7;
                if(week==0){
                    week = '天';
                    System.out.println(month + "月" + day + "日是星期天");
                }else{
                    System.out.println(month + "月" + day + "日是星期" + week);
                }
                break;
            case 3:
                days = day + 31 + 28;
                week = (week + days - 1) % 7;
                if(week==0){
                    week = '天';
                    System.out.println(month + "月" + day + "日是星期天");
                }else{
                    System.out.println(month + "月" + day + "日是星期" + week);
                }
                break;
            case 4:
                days = day + 31 + 28 + 31;
                week = (week + days - 1) % 7;
                if(week==0){
                    week = '天';
                    System.out.println(month + "月" + day + "日是星期天");
                }else{
                    System.out.println(month + "月" + day + "日是星期" + week);
                }
                break;
            case 5:
                days = day + 31 + 28 + 31 + 30;
                week = (week + days - 1) % 7;
                if(week==0){
                    week = '天';
                    System.out.println(month + "月" + day + "日是星期天");
                }else{
                    System.out.println(month + "月" + day + "日是星期" + week);
                }
                break;
            case 6:
                days = day + 31 + 28 + 31 + 30 + 30;
                week = (week + days - 1) % 7;
                if(week==0){
                    week = '天';
                    System.out.println(month + "月" + day + "日是星期天");
                }else{
                    System.out.println(month + "月" + day + "日是星期" + week);
                }
                break;
            case 7:
                days = day + 31 + 28 + 31 + 30 + 30 + 31;
                week = (week + days - 1) % 7;
                if(week==0){
                    week = '天';
                    System.out.println(month + "月" + day + "日是星期天");
                }else{
                    System.out.println(month + "月" + day + "日是星期" + week);
                }
                break;
            case 8:
                days = day + 31 + 28 + 31 + 30 + 30 + 31 + 31;
                week = (week + days - 1) % 7;
                if(week==0){
                    week = '天';
                    System.out.println(month + "月" + day + "日是星期天");
                }else{
                    System.out.println(month + "月" + day + "日是星期" + week);
                }
                break;
            case 9:
                days = day + 31 + 28 + 31 + 30 + 30 + 31 + 31 + 30;
                week = (week + days - 1) % 7;
                if(week==0){
                    week = '天';
                    System.out.println(month + "月" + day + "日是星期天");
                }else{
                    System.out.println(month + "月" + day + "日是星期" + week);
                }
                break;
            case 10:
                days = day + 31 + 28 + 31 + 30 + 30 + 31 + 31 + 30 + 31;
                week = (week + days - 1) % 7;
                if(week==0){
                    week = '天';
                    System.out.println(month + "月" + day + "日是星期天");
                }else{
                    System.out.println(month + "月" + day + "日是星期" + week);
                }
                break;
            case 11:
                days = day + 31 + 28 + 31 + 30 + 30 + 31 + 31 + 30 + 31 + 30;
                week = (week + days - 1) % 7;
                if(week==0){
                    week = '天';
                    System.out.println(month + "月" + day + "日是星期天");
                }else{
                    System.out.println(month + "月" + day + "日是星期" + week);
                }
                break;
            case 12:
                days = day + 31 + 28 + 31 + 30 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                week = (week + days - 1) % 7;
                if(week==0){
                    week = '天';
                    System.out.println(month + "月" + day + "日是星期天");
                }else{
                    System.out.println(month + "月" + day + "日是星期" + week);
                }
                break;
        }

    }
}
