package com.yyds.e_areacode;

public class Dog {
    {
        //构造代码块:写在类中方法外的代码块
        System.out.println("构造代码块执行了~");
    }

    //编写构造

    public Dog() {
        System.out.println("无参构造执行了~");
    }
    public Dog(int num){
        System.out.println("带参构造执行了~");
    }
}
