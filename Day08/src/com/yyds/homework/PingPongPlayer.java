package com.yyds.homework;

public class PingPongPlayer extends Athlete {
    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void Study() {
        System.out.println(getAge() + "的乒乓球运动员" + getName() + "在学习打乒乓球杀球~");
    }
}
