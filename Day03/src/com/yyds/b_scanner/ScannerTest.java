package com.yyds.b_scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        //求3个数的最大值
        //创建对象
        Scanner sc = new Scanner(System.in);
        //提示
        System.out.println("请输入第一个数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数:");
        int b = sc.nextInt();
        System.out.println("请输入第三个数:");
        int c = sc.nextInt();
//        int a[3];
//        for (int i = 0; i < 3; i++) {
//            System.out.println("请输入第" + i + "个数:");
//            a[i] = sc.nextInt();
//        }
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大值max = " + max);

    }
}
