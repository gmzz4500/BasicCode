package com.yyds.e_areacode;

public class Fu {
    static {
        System.out.println("父类的静态代码块执行了");
    }

    {
        System.out.println("父类的构造代码块执行了");
    }

    public Fu() {
        this("Hello");
        System.out.println("父类的无参构造执行了");
    }
    public Fu(String str){
        super();
        System.out.println("父类的带参构造执行了");
    }
}
