package com.yyds.j_nonameclass;

public class Demo {
    public static void main(String[] args) {
        //创建实现类对象
        InterImpl inter = new InterImpl();
        inter.show();

        //创建子类的对象
        Zi zi = new Zi();
        zi.function();

        System.out.println("===================");

        //直接创建接口对象
        //整体是 创建这个不知类名的实现类对象
        InterFu son = new InterFu() {
            //不知类名的 实现类的类主体
            @Override
            public void show() {
                System.out.println("匿名内部类重写的show方法");
            }
        };

        son.show();

        new InterFu(){
            //不知类名的 实现类的类主体
            @Override
            public void show() {
                System.out.println("匿名对象匿名内部类重写的show方法");
            }
        }.show();
        System.out.println("----------------------");

        InterFu son1 = () -> System.out.println("Lambda重写的show方法");

        son1.show();

    }
}
