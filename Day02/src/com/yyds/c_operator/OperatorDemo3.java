package com.yyds.c_operator;
/*
    ++/--

    ++/--运算法则:
        1. 变量的值+1/-1
        2. 把变化后的值赋值给原来的变量

    注意:
	1. ++/-- 只能和变量一起用,不可以和常量一起用
	2. ++/-- 可以放在变量的前后
	    单独使用 : 没有任何变化,变量做+1/-1操作
	    参与运算 :
	        ++/--在变量前 : 先自增/自减 再参与运算
	        ++/--在变量后 : 先参与运算 再自增/自减

	 ++/-- 单独运算的时候是绝大多数情况,极少情况下参与运算!!
	 3. 输出也是一种运算!!
	 4. 不准这样使用++/--
	        d = ++d;
            d = d++;

 */
public class OperatorDemo3 {
    public static void main(String[] args) {
        //定义一个变量
        int num = 10;
        System.out.println("num = " + num);//10
        //变量自增
        //num++;
        ++num;
        System.out.println("num = " + num);//11
        System.out.println("------------------");
        //定义一个变量
        int a = 100;
        //++参与运算
        int b = a++; //先运算,在自增
        System.out.println("b = " + b);//100
        System.out.println("a = " + a);//101
        System.out.println("------------------");
        b = ++a; //先自增,再运算
        System.out.println("b = " + b);//102
        System.out.println("a = " + a);//102
        System.out.println("------------------");
        int c = 20;
        System.out.println(c++);//20
        System.out.println(c);//21
        System.out.println("------------------");
        //以下代码不要这样写!!
        int d = 30;

        //d = ++d;//31
        //d = d++; // 一句代码中只能对变量进行一次赋值操作
        d++;
        ++d;

        System.out.println("d = " + d);//30
        System.out.println("d = " + d);//30

    }
}
