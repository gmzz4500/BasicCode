package com.yyds.f_classinclass;

public class Outer {
    int numout = 222;
    int num = 111;
    public void showOut(){
        System.out.println("showOut");
    }
    public void show(){
        System.out.println("外部类的show");
    }
    public void method(){
        System.out.println("numOut = " + numout);
        System.out.println("num = " + num);
        showOut();
        show();
        System.out.println("---------------");

    }
    //成员内部类
    class Inner{
        int numIn = 200;
        int num = 100;
        public void showIn(){
            System.out.println("showIn");
        }
        public void show(){
            System.out.println("内部类的show");
        }
        //在内部类中访问成员
        public void method(){
            this.showIn();
            showOut();
            this.show();
            show();

            System.out.println("---------------");
            System.out.println("numIn = " + numIn);
            System.out.println("numout = " + numout);
            int num = 50;
            System.out.println("num = " + num);
            System.out.println("this.num = " + this.num);
            System.out.println("Outer.this.num = " + Outer.this.num);
        }
    }
}
