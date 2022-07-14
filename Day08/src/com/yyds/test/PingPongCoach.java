package com.yyds.test;

public class PingPongCoach extends Coach {
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("年龄" + getAge() + "的乒乓球教练" + getName() + "在教乒乓球运动员杀球");
    }
}
