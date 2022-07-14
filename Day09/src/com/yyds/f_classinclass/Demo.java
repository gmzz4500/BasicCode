package com.yyds.f_classinclass;

public class Demo {
    public static void main(String[] args) {
        //在第三方类中不能直接创建内部类对象
        Outer.Inner inner = new Outer().new Inner();

    }
}
