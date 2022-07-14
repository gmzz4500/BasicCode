package com.yyds.test;

public class BasketballCoach extends Coach implements LearnEnglish{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("年龄" + getAge() + "的篮球教练" + getName() + "在教篮球运动员扣篮");
    }

    @Override
    public void learnEnglish() {
        System.out.println("年龄" + getAge() + "的篮球教练" + getName() + "在学习英语");
    }
}
