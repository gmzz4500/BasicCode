package com.yyds.g_while;

/*
    //用while循环求5位的回文数,并每5个一行输出打印
 */
public class WhileTest2 {
    public static void main(String[] args) {
        int i = 10000;
        int count = 0;
        while (i < 100000) {
            //个位
            int a = i % 10;
            //十位
            int b = i / 10 % 10;
            //千位
            int c = i / 1000 % 10;
            //万位
            int d = i / 10000 % 10;
            if (a == d && b == c) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
            i++;
        }
        System.out.println("5位回文数个数:" + count);
    }
}
