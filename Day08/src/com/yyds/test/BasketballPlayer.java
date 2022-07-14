package com.yyds.test;

public class BasketballPlayer extends Player implements LearnEnglish{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("年龄" + getAge() + "的篮球运动员" + getName() + "在学习扣篮");
    }

    @Override
    public void learnEnglish() {
        System.out.println("年龄" + getAge() + "的篮球运动员" + getName() + "在学习英语");
    }
}
