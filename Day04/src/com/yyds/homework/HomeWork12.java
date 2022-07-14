package com.yyds.homework;

import java.util.Scanner;

/*
    从键盘输入本组学员的人数，和本组学员的姓名，用数组存储姓名，然后再从键盘输入一个姓名，
    查找它是否在之前的数组中，如果存在，就显示它的下标
 */
public class HomeWork12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入本组学员的人数:");
        int num = sc.nextInt();
        String[] s = new String[num];
        for (int i = 0; i < s.length; i++) {
            System.out.println("请输入第" + i + "位同学的姓名");
            s[i] = sc.next();
        }
        System.out.println("请输入您要查找的学员姓名:");
        String name = sc.next();
        int index = -1;
        for (int i = 0; i < s.length; i++) {
            if (name.equals(s[i])) {
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("您查找到学员姓名不存在!");
        }else{
            System.out.println("您查找的学员姓名已录入,下标为:" + index);

        }
    }
}
