package com.yyds.homework;

import java.util.Scanner;

/*
    从键盘输入一个整数，判断它是奇数还是偶数（这里把0归为偶数）
 */
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //提示
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num + "是偶数");
        }else {
            System.out.println(num + "是奇数");
        }
    }
}
