package com.yyds.g_staticclassinclass;

public class Outer {
    int numOut = 222;
    int num = 111;

    public void showOut() {
        System.out.println("showOut");
    }

    public void show() {
        System.out.println("外部类的show");
    }

    public void method() {
        //创建内部类对象
        Inner inner = new Inner();

    }

    //静态成员内部类:推荐的成员内部类的写法

    static class Inner {
        int numIn = 200;
        int num = 100;

        public void showIn() {
            System.out.println("showIn");
        }

        public void show() {
            System.out.println("内部类的show");
        }
        public void method(){
            System.out.println("numIn = " + numIn);
            System.out.println("num = " + num);
            showIn();
            show();
            System.out.println("-----------------");
            Outer outer = new Outer();
            System.out.println("outer.numOut = " + outer.numOut);
        }
    }
}
