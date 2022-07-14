package com.yyds.f_for;

public class ForTest3 {
    public static void main(String[] args) {
        //求所有的回文数,并统计回文数的个数,每5个一行打印输出
        int count = 0;
        for (int i = 10000; i < 100000; i++) {
            //个位
            int a = i % 10;
            //十位
            int b = i / 10 % 10;
            //千位
            int c = i / 1000 % 10;
            //万位
            int d = i / 10000 % 10;
            //求回文数
            if (a == d && b == c) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }

            }
        }
        System.out.println("5位回文数的个数为:" + count);
    }
}
