package com.yyds.homework;

public class HomeWork2 {
    public static void main(String[] args) {
        char ch = 'J';
        char ch1 = (char) (ch + 32);
        System.out.println(ch1);

        char ch2 = 'a';
//        ch2 = (char)(ch2 - 32);
        ch2 -= 32;
        System.out.println(ch2);

        double d3 = 12.5;
        int i3 = 5;
        double sum3 = d3 + i3;
        System.out.println(sum3);
        int sum4 = (int)sum3;
        System.out.println(sum4);

        double d4 = 1.25;
        int i4 = 7;
        int mul4 = (int)(d4 * i4);
        System.out.println(mul4);
    }
}
