package com.yyds.method;
/*
    使用方法完成 求3个数的最大值的案例
 */
public class MethodTest {
    public static void main(String[] args) {
        System.out.println("开始");
        //在使用方法的地方调用方法
        getMax();
        System.out.println("结束");
    }
    //定义方法
    public static void getMax(){
        int a = 10;
        int b = 4;
        int c = 12;
        //求最大值
        int temp = a > b ?a:b;
        int max = temp > c ? temp:c;
        System.out.println("max = " + max);
    }
}
