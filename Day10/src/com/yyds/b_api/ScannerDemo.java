package com.yyds.b_api;

import java.util.Date;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //提示
        System.out.println("请您输入一句话");

        String str = sc.nextLine();
        System.out.println("str = " + str);
        Date date = new Date();
        System.out.println("date.toLocaleString() = " + date.toLocaleString());
    }
}
