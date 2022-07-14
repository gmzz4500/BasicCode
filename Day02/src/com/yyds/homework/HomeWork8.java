package com.yyds.homework;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        int flag = 0;
        while (flag < 5) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入一个年份：");
            int year = input.nextInt();
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + "年是闰年");
            } else {
                System.out.println(year + "年不是闰年");
            }
            flag++;
        }
    }
}
