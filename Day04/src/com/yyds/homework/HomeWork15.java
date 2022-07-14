package com.yyds.homework;

import java.util.Scanner;

/*
    使用二维数组打印一个n行的杨辉三角
 */
public class HomeWork15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想要打印的行数:");
        int num = sc.nextInt();
        //先确定行数
        int[][] s = new int[num][];
        //再确定每一行的列数
        for (int i = 0; i < s.length; i++) {
            s[i] = new int[i+1];
        }
        //每一行的第一个和最后一个数字都是1,确定下来
        for (int i = 0; i < s.length; i++) {
            s[i][0] = 1;
            s[i][i] = 1;
            //其他元素
            for (int j = 1; j < s[i].length-1; j++) {
                s[i][j] = s[i-1][j-1] + s[i-1][j];
            }
        }
        //打印显示
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
