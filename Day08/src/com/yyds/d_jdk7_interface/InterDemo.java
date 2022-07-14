package com.yyds.d_jdk7_interface;

public class InterDemo {
    public static void main(String[] args) {
        //创建实现类对象
        InterAImpl ia = new InterAImpl();
        ia.show();
        //子类对象访问父接口中的自定义常量
        System.out.println("ia.NUM = " + ia.Num);
        System.out.println("InterA.NUM = " + InterA.Num);
    }
}
