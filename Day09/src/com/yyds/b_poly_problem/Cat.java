package com.yyds.b_poly_problem;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼~");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠~");
    }
}
