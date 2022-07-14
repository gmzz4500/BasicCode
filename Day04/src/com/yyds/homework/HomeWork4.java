package com.yyds.homework;

/*
    统计字符出现的次数并打印到控制台
 */
public class HomeWork4 {
    public static void main(String[] args) {
        char[] c = {'a', 'l', 'f', 'm', 'f', 'o', 'b', 'b', 's', 'n'};
        int[] counts = new int[26];
        for (int i = 0; i < c.length; i++) {
            counts[c[i] - 97]++;
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.print((char) (i + 97) + "--" + counts[i] + "\t");
            }
        }
    }
}
