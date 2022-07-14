package com.yyds.b_oop1;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机对象
        Phone p = new Phone();
        //给属性赋值
        p.setBrand("小米12");
        p.setColor("黑色");
        p.setSize("6.6英寸");
        p.setMemory("256G");
        p.setPrice(5000);
        //调用方法
        p.show();
    }
}
