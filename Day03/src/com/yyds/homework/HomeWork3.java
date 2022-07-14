package com.yyds.homework;

import java.util.Scanner;

/*
    实现一个打折功能
 */
public class HomeWork3 {
    public static void main(String[] args) {
        double discount = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入总价格:");
        double totalPrice = sc.nextDouble();
        if (totalPrice >= 500) {
            discount = 0.5;
            System.out.println("总价:"+totalPrice);
            System.out.println("折扣:" + discount);
            System.out.println("折扣后总价:"+totalPrice*discount);
        }else if(totalPrice>=400){
            discount = 0.6;
            System.out.println("总价:"+totalPrice);
            System.out.println("折扣:"+discount);
            System.out.println("折扣后总价:"+totalPrice*discount);
        }else if (totalPrice>=300){
            discount = 0.7;
            System.out.println("总价:"+totalPrice);
            System.out.println("折扣:"+discount);
            System.out.println("折扣后总价:"+totalPrice*discount);
        }else if (totalPrice>=200){
            discount=0.8;
            System.out.println("总价:"+totalPrice);
            System.out.println("折扣:"+discount);
            System.out.println("折扣后总价:"+totalPrice*discount);
        }else if(totalPrice>=0){
            System.out.println("总价:"+totalPrice);
            System.out.println("折扣:"+ discount);
            System.out.println("折扣后总价:"+totalPrice*discount);
        }else {
            System.out.println("输入有误!");
        }
    }
}
