package com.yyds.homework;

import java.util.Scanner;

/*
    从键盘输入一个字符，判断它是字母还是数字，还是其他字符
 */
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //提示
        System.out.println("请输入一个字符:");
        //输入字符
        char c = sc.next().charAt(0);
        //判断
        if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
            System.out.println(c + "是字母");
        } else if (c >= '0' && c <= '9') {
            System.out.println(c + "是数字");
        } else {
            System.out.println(c + "是其他字符");
        }
    }
}
