package com.yyds.b_variable;
/*
    自动提升
    强制转换 ： 小类型的白能量强制接收大类型的值/变量
        强转格式 : 小类型 变量名 = （小类型）大类型变量/值；

        注意：数据是什么类型就拿什么类型的变量接收，不要动不动强转
*/
public class VariableDemo {
    public static void main(String[] args) {
        //大类型的变量接受小类型的值/变量
        byte b = 20;
        //赋值给大类型的变量
        float f = b;
        System.out.println(f);
        System.out.println("--------------");
        //定义int变量
        int num = 100;
        //小类型的变量接收大类型的值/变量
        short s = (short)num;
        System.out.println(s);
        System.out.println("---------------");
        double d = 13.14;
        //强转接收 ： .castvar
        int result = (int) d;
        System.out.println(result);
        System.out.println("----------------");
        //int 变量
        int num1 = 200;
        //-128~127
        byte b1 = (byte) num1;
        System.out.println(b1);
    }
}
