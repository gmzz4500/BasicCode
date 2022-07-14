package com.yyds.h_classinmethod;

public class Outer {
    int numOut = 200;
    int num = 100;

    public void showOut() {
        System.out.println("showOut");
    }

    public void show() {
        System.out.println("外部类的show");
    }

    public void method() {
        //   在外部类中不可以使用 局部内部类
    }


    public void classMethod() {

        //局部内部类 : 只为方法服务
        class Inner {
            int numIn = 200;
            int num = 100;

            public void showIn() {
                System.out.println("showIn");
            }

            public void show() {
                System.out.println("内部类的show");
            }

            public void method() {
                System.out.println("numOut = " + numOut);
                System.out.println("num = " + num);
                System.out.println("Outer.this.num = " + Outer.this.num);
                Outer.this.show();//外部类
                show();//内部类的show
            }
        }

        //classMethod方法内 可以使用局部内部类 ,出了方法局部内部类就用不了
        Inner inner = new Inner();
    }
}
