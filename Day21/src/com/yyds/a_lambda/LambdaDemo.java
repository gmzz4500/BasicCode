package com.yyds.a_lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        InterAImpl interfaceA = new InterAImpl();
        System.out.println("interfaceA.show() = " + interfaceA.show());
        System.out.println("===================");
        A a = new A() {
            @Override
            public int show() {
                System.out.println("匿名内部类实现的show方法~");
                return 2;
            }
        };
        System.out.println("a.show() = " + a.show());
        System.out.println("====================");
        //lambda实现
        A a1 = () -> {
            System.out.println("匿名内部类实现的show方法~");
            return 3;
        };
        System.out.println("a1.show() = " + a1.show());
    }
}

@FunctionalInterface
interface A {
    public abstract int show();
}

class InterAImpl implements A {

    @Override
    public int show() {
        System.out.println("Lambda重写的show方法~");
        return 1;
    }
}