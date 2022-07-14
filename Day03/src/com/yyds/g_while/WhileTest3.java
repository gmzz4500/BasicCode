package com.yyds.g_while;
/*
    while循环实现一张纸0.0001米,折叠多少次能达到珠穆朗玛峰的高度8848
 */
public class WhileTest3 {
    public static void main(String[] args) {
        int count = 0;
        double d = 0.0001;
        while(d<8848){
            d *= 2;
            count++;
        }
        System.out.println("count = " + count);
    }
}
