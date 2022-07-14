package com.yyds.e_random;

import java.util.Random;
import java.util.Scanner;

/*
    随机数小游戏
 */
public class RandomTest {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //创建随机数对象
        Random r = new Random();
        //产生随机数
        int number = r.nextInt(100) + 1;
        while (true) {
            //提示
            System.out.println("请输入一个数字(0-100):");
            //键盘录入
            int guessNumber = sc.nextInt();
            //猜数
            //控制输入范围
            if (guessNumber < 1 || guessNumber > 100) {
                System.out.println("输入有误,请重新输入!");
            } else if (guessNumber > number) {
                System.out.println("你猜的数" + guessNumber + "大了~");
            } else if (guessNumber < number) {
                System.out.println("你猜的数" + guessNumber + "小了~");
            } else {
                System.out.println("恭喜你,猜对了随机数:" + number);
                break;
            }
        }
    }
}
