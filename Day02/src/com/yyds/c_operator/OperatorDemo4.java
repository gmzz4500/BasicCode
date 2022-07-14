package com.yyds.c_operator;
/*
    拓展的赋值运算符: 隐含了强制类型转换
        展开式 :
            short s = 30;
            s += 50; --> s = (short)(s + 50);
 */
public class OperatorDemo4 {
    public static void main(String[] args) {
        //+=
        int num = 100;
        System.out.println("num = " + num);

        num += 50;// num = num + 50;

        System.out.println("num = " + num);

        //拓展的赋值运算符隐含了强制类型转换
        byte b = 10;

        //b = b + 20;//int + int = int 错误
        b += 20;

        System.out.println("b = " + b);
        System.out.println("---------------");

        byte b1 = 10;
        byte b2 = 120;

        //byte b3 = 10 + 20;
        byte b3 = 10 + 20;
    }
}
