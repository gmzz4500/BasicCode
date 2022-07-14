package com.yyds.b_poly_problem;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头~");
    }
    public void lookHome(){
        System.out.println("狗看家~");
    }
}
