package com.yyds.d_switch;

import java.util.Scanner;

public class Switch_Test {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //提示
        System.out.println("请您输入要查询的月份:");
        //录入数据
        int month = sc.nextInt();
        //switch 进行判断
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("您要查询的月份" + month + "月是冬季~");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("您要查询的月份" + month + "月是春季~");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("您要查询的月份" + month + "月是夏季~");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("您要查询的月份" + month + "月是秋季~");
                break;
            default:
                System.out.println("请输入1-12内的整数");
        }
    }
}
