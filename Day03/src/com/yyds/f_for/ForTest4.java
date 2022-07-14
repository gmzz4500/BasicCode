package com.yyds.f_for;

/*
    一张纸的厚度是0.0001米,珠穆朗玛峰的高度是8848米,请问折多少次可以达到珠穆朗玛峰的高度
 */
public class ForTest4 {
    public static void main(String[] args) {
        int count = 0;
        for (double d = 0.0001; d < 8848; d *= 2) {
            count++;
        }
        System.out.println("count = " + count);
    }
}
