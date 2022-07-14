package com.yyds.c_operator;
/*
    1.字符类型的数据做运算的时候，会先找ASCII码表找到对应的数值 再进行运算
    'a' 97,'A' 65,'0' 48
    中文没有规律，符号没有规律
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        //char做算数运算
        System.out.println('a' + 0);
        System.out.println('A' + 0);
        System.out.println('b' + 0);
        System.out.println('B' + 0);
        System.out.println('0' + 0);
        System.out.println('1' + 0);
        System.out.println('中' + 0);
        System.out.println('国' + 0);
        System.out.println('！' + 0);
        System.out.println('@' + 0);

        System.out.println("---------------");
        char ch1 = '0';
        char ch2 = '1';
        int result = ch1 + ch2;
        System.out.println((char) result);
    }
}
