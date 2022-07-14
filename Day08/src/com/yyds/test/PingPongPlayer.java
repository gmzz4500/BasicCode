package com.yyds.test;

public class PingPongPlayer extends Player{
    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("年龄" + getAge() + "的乒乓球运动员" + getName() + "在学习杀球");
    }
}
