package com.yyds.homework;

public class BasketballPlayer extends Athlete implements StudyEnglish{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void Study() {
        System.out.println(getAge() + "的篮球运动员" + getName() + "在学习打篮球扣篮~");
    }

    @Override
    public void studyEnglish() {
        System.out.println(getAge() + "的篮球运动员" + getName() + "在学习英语~");
    }
}
