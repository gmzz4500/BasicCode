package com.yyds.a_operator;

public class OperatorTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
//        int temp = a > b ? a : b;
//        int max = temp > c ? temp : c;
        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println("max = " + max);
    }
}
