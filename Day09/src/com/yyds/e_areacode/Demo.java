package com.yyds.e_areacode;

public class Demo {
    public static void main(String[] args) {
        {
            //局部代码块:限制变量的生命周期->无用
            int num = 10;
        }

        //创建狗对象
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(100);
        System.out.println("============");
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat(10);

        System.out.println("==============");
        Zi zi = new Zi();
    }
}
