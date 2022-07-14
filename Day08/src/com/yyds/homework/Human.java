package com.yyds.homework;

public class Human {
    private String name;
    private int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(String food) {
        System.out.println(getAge() + "的" + getName() + "在吃" + food);
    }

    public void sleep() {
        System.out.println(getAge() + "的" + getName() + "在睡觉");
    }
}
