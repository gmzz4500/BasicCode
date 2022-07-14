package com.yyds.a_stringbuilder;

import java.util.Random;

/*
    StringBuilder append(任意类型的数据):在sb对象的后方拼接传入的内容并返回自己
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb = " + sb);

        StringBuilder sb1 = sb.append(100);
        System.out.println("sb = " + sb);
        System.out.println("sb1 = " + sb1);
        System.out.println(sb == sb1);
        //链式编程
        sb.append(true).append("Java").append(13.14).append(new Random());
        System.out.println("sb = " + sb);
        //一键翻转,并返回自己
        System.out.println("sb = " + sb.reverse());

    }
}
