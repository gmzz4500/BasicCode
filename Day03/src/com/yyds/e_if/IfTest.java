package com.yyds.e_if;

import java.util.Scanner;

/*
    求3个数的最大值
 */
public class IfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //提示
        System.out.println("请输入三个整数:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        //用if else 结构来求最大值
        if(num1>num2){
            if(num1>num3){
                System.out.println("最大值是:" + num1);
            }else{
                System.out.println("最大值是:"+num3);
            }
        }else{
            if(num2>num3){
                System.out.println("最大值是:"+num2);
            }else{
                System.out.println("最大值是:"+num3);
            }
        }
    }
}
