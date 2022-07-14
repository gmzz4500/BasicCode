package com.yyds.c_operator;

public class OperatorDemo8 {
    public static void main(String[] args) {
        //二进制的逻辑运算
        System.out.println(7 & 5);//5
        System.out.println(7 | 5);//7
        System.out.println(7 ^ 5);//2

        //二进制的位移运算 :
        System.out.println(8 >> 1);//4
        System.out.println(8 / 2);//效率慢的
        System.out.println(8 << 1);//32
    }
}
