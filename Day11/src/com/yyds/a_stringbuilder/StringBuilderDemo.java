package com.yyds.a_stringbuilder;
/*
    StringBuilder 的构造:
        StringBuilder() : 构造一个不带任何字符的字符串生成器,其初始容量为16个字符
        StringBuilder(String str) : 实现String对象-->StringBuilder对象
 */

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb = " + sb);

        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println("sb1 = " + sb1);

//        StringBuilder sb2 = "Hello";//不能这样用

        System.out.println("sb1.capacity() = " + sb1.capacity());//21
        System.out.println("sb1.length() = " + sb1.length());//5
    }
}

