package com.yyds.homework;
/*
    求ax²+bx+c=0的根.
 */
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入3个数:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double num = b*b-4*a*c;
        double x1=0;
        double x2=0;
        if(num>0){
            x1=(-b+Math.sqrt(num))/(2*a);
            x2=(-b-Math.sqrt(num))/(2*a);
            System.out.println("x1 =" + x1);
            System.out.println("x2 =" + x2);
        }else if(num==0){
            x1=x2=-b/(2*a);
            System.out.println("x1=x2=" +x1);
        }else if(a==0&b!=0){
            x1=x2=-c/b;
            System.out.println("x1=x2=" +x1);
        }else {
            System.out.println("不是方程!");
        }
    }
}
