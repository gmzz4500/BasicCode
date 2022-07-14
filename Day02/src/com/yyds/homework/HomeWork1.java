package com.yyds.homework;

public class HomeWork1 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        int b3 = b1 + b2;
        byte b4 = (byte) (b1 + b2);
        System.out.println("byte类型b1和b2的和为：" + b3);
        System.out.println(b4);

        short s1 = 1000;
        short s2 = 2000;
        short s3 = (short) (s1 + s2);
        System.out.println("short类型s1和s2的和为：" + s3);

        char ch1 = 'a';
        int i1 = 30;
        char c3 = (char)(ch1 - i1);
        int c4 = ch1 - i1;
        System.out.println("char类型ch1和int类型i1的差为：" + c3);
        System.out.println(c4);
    }
}
