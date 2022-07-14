package com.yyds.homework;

import java.util.Scanner;

/*
    模拟在一副牌中,抽取第1张,第5张,第50张扑克牌
 */
public class HomeWork3 {
    public static void main(String[] args) {
        String[] s1 = {"黑桃", "红桃", "梅花", "方片"};
        String[] s2 = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[][] s3 = new String[4][13];
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                s3[i][j] = s1[i] + s2[j];
                System.out.print(s3[i][j] + "\t");
            }
            System.out.println();
        }
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        //提示
        int i = 0;
        while (i++ < 3) {
            System.out.print("请输入要抽取的牌号:");
            //键盘输入
            int num = sc.nextInt();
            //打印
            if (num <= 13) {
                System.out.println(s1[0] + s2[num % 13 - 1] + "\t");
            } else if (num > 13 && num <= 26) {
                System.out.println(s1[1] + s2[num % 13 - 1] + "\t");
            } else if (num > 26 && num <= 39) {
                System.out.println(s1[2] + s2[num % 13 - 1] + "\t");
            } else if (num > 39 && num < 52) {
                System.out.println(s1[3] + s2[num % 13 - 1] + "\t");
            }
        }
    }
}



