package com.yyds.homework;

public class PingPongTrainer extends Trainer {
    public PingPongTrainer() {
    }

    public PingPongTrainer(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球运动员抽球~");
    }
}
