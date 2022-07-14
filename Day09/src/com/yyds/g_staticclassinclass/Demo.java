package com.yyds.g_staticclassinclass;

public class Demo {
    public static void main(String[] args) {
        //Outer.Inner inner = new Outer().new Inner(); 创建成员内部类对象
        Outer.Inner inner = new Outer.Inner(); //创建静态成员内部类对象
    }
}
