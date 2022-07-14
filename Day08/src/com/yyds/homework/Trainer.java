package com.yyds.homework;

public abstract class Trainer extends Human {
    public Trainer() {
    }

    public Trainer(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
