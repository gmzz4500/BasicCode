package com.yyds.c_string;

import java.util.Scanner;

/*
 * 统计出字符串中的大写英文字母,小写英文字母,数字,其他字符分别有多少个
 * */
public class StringTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一句话:");
        String line = sc.nextLine();
        char[] chars = line.toCharArray();
        int smallCount = 0;
        int bigCount = 0;
        int numCount = 0;
        int otherCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                smallCount++;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                bigCount++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                numCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("smallCount = " + smallCount);
        System.out.println("bigCount = " + bigCount);
        System.out.println("numCount = " + numCount);
        System.out.println("otherCount = " + otherCount);
    }
}
