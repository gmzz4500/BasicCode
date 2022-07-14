package com.yyds.e_areacode;

public class Zi extends Fu {
    static {
        System.out.println("子类的静态代码块执行了");
    }
    {
        System.out.println("子类的构造代码块执行了");
    }
    public Zi(){
        this(100);
        System.out.println("子类无参构造执行了");
    }
    public Zi(int num){
        super();
        System.out.println("子类带参构造执行了");
    }
}
