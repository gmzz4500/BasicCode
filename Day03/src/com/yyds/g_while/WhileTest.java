package com.yyds.g_while;

/*
    用while循环求1-100内所有奇数的和
 */
public class WhileTest {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        //先找出1-100的所有数
        int x = 1;
        while (x < 100) {
            if (x % 2 == 1) {
                sum += x;
                count++;
            }
            x++;
        }
        System.out.println("sum = " + sum);
        System.out.println("奇数的个数:" + count);
    }
}
