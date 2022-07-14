package com.yyds.homework;
//

import java.util.Random;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        //创建随机数对象
        Random r = new Random();
        //产生随机数
        int number = r.nextInt(100) + 1;
        while (true) {
            //提示
            System.out.println("请输入一个1-100的整数:");
            //键盘输入
            int guessNumber = sc.nextInt();
            if (guessNumber >= 1 && guessNumber <= 100) {
                //猜数
                if (guessNumber > number) {
                    System.out.println("您猜的数" + guessNumber + "大了~");
                } else if (guessNumber < number) {
                    System.out.println("您猜的数" + guessNumber + "小了~");
                } else {
                    System.out.println("恭喜你,你猜到了随机数为:" + number);
                    break;
                }
            } else {
                System.out.println("输入有误,请重新输入!");
            }

        }
    }
}
