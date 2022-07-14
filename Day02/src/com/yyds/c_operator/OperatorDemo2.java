package com.yyds.c_operator;
/*
    1.字符串做加法就是在做字符串的连接
        soutv : 带名称的打印输出
    2.字符串做加法的结果一定是字符串类型
    3.字符和字符串做加法运算，字符不需要找ASCII码而是直接连接在字符串上
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
        System.out.println("Hello" + 100);

        int age = 18;
        System.out.println("age = " + age);
        System.out.println("-------------");
        System.out.println("Hello" + 100 + 200);
        System.out.println(100 + 200 + "Hello");
        System.out.println('a' + 100 + "Hello");
        System.out.println('a' + "Hello");
    }
}
