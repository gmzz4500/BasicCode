package com.yyds.e_if;

import java.util.Scanner;

/*
    键盘录入考试分数,根据分数情况给予不同的评级
 */
public class IfTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入考试分数:");
        int score = sc.nextInt();
        //if...else if 结构来实现功能
        if (score > 90 && score <= 100) {
            System.out.println("你成绩为 优秀");
        } else if (score>80&&score <= 90){
            System.out.println("你的成绩为 良好");
        }else if(score>=60&&score<=80){
            System.out.println("你的成绩为 一般");
        }else if(score>=0&&score<60){
            System.out.println("你的成绩为 不及格");
        }else{
            System.out.println("输入有误,请重新输入0-100内的整数!");
        }
    }
}
