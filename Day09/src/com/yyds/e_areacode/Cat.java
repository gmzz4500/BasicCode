package com.yyds.e_areacode;

public class Cat {
    static {
        //静态代码块
        System.out.println("静态代码块执行了");
    }

    {
        //构造代码块
        System.out.println("构造代码块执行了");
    }

    //编写构造

    public Cat() {
        System.out.println("无参构造执行了");
    }
    public Cat(int num){
        System.out.println("带参构造执行了");
    }
}
