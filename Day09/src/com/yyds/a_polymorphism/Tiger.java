package com.yyds.a_polymorphism;

public class Tiger implements Animal {
    @Override
    public void eat() {
        System.out.println("老虎吃肉~");
    }
    public void climbTree(){
        System.out.println("老虎爬树~");
    }
}
