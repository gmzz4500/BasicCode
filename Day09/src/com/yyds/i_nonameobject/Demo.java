package com.yyds.i_nonameobject;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        //创建随机数对象
        Random r = new Random();//random对象的名字
        int i = r.nextInt(100);

        //继续使用
        int num = r.nextInt(20);

        //匿名对象没有对象名的对象
        int i1 = new Random().nextInt(100);
        int num1 = new Random().nextInt(20);

        show(new Random());
        show(new Random());
        show(new Random());
        show(new Random());
    }
    public static void show(Random r){

    }
}
