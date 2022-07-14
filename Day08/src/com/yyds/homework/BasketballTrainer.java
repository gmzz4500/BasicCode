package com.yyds.homework;

public class BasketballTrainer extends Trainer implements StudyEnglish{
    public BasketballTrainer() {
    }

    public BasketballTrainer(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教篮球运动员扣篮~");
    }

    @Override
    public void studyEnglish() {
        System.out.println("篮球教练学习英语");
    }
}
