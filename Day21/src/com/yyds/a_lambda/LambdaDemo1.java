package com.yyds.a_lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        C c = new C() {
            @Override
            public int show(String s) {
                return Integer.parseInt(s);
            }
        };
        int num = c.show("100");
        System.out.println("num = " + num);
        System.out.println("====================");
        C c1 = s -> Integer.parseInt(s);
        int num1 = c1.show("200");
        System.out.println("num1 = " + num1);
    }
}
interface C{
    public abstract int show(String s);
}