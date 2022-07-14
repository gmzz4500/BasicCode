package com.yyds.homework;

import java.util.Scanner;

/*
    从键盘输入本组学员的人数，和本组学员的成绩，用数组存储成绩，然后实现从高到低排序
 */
public class HomeWork11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入本组学员的人数:");
        int num = sc.nextInt();
        double[] score = new double[num];
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + i + "位同学的成绩:");
            score[i] = sc.nextDouble();
        }
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length - 1 - i; j++) {
                if (score[j] < score[j + 1]) {
                    double temp = score[j + 1];
                    score[j + 1] = score[j];
                    score[j] = temp;
                }
            }
        }
        for (int i = 0; i < score.length; i++) {
            System.out.print("[" + score[i] + "] ");
        }

    }
}
