package com.yyds.arraytest;

import java.util.Scanner;

/*
    从键盘录入一个数,求该数在数组中第一次出现的索引值
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        //创建一个数组
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入您想查找的数字:");
        int num = sc.nextInt();
        int index = -1;
        //遍历数组,与num进行逐一比较
//        for (int i = 0; i < arr.length; i++) {
//            if(num == arr[i]){
//                index = i;
//                break;//将break去掉,那么最后找到的索引值就是num最后一次出现的索引值
//            }
//        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (num == arr[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("对不起,您查找的数不存在!");
        } else {
            System.out.println("您想查找的数 " + num + "在数组中最后一次出现的索引值为: " + index);
        }
    }
}
