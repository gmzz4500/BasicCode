package com.yyds.homework;

import java.util.Scanner;

/*
    判断数组中的元素值是否对称
 */
public class HomeWork6 {
    public static void main(String[] args) {
        //创建键盘输入的对象
        Scanner sc = new Scanner(System.in);
        //提示
        //键盘输入
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入数组第" + i + "个元素:");
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                flag = false;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("是否对称:" + flag);
    }
}
