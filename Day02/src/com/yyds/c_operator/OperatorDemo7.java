package com.yyds.c_operator;
/*
    //带有短路效果的逻辑运算符
	&& : 逻辑双与
		运算法则 :有false则为false
		短路效果 : 左边的表达式结果为false 右边的表达式 不执行!!
	|| : 逻辑双或
		运算法则 :有true则为true
		短路效果 : 左边的表达式为true 右边的表达式 不执行!!
 */
public class OperatorDemo7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a > 10 && b++ < 20);//false && 不执行 -> false
        System.out.println("b = " + b);//20

        System.out.println(a == 10 || b++ < 20);//true || 不执行 -> true
        System.out.println("b = " + b);//20
    }
}
