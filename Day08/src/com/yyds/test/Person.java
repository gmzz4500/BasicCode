package com.yyds.test;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    public void eat(String food){
        System.out.println("年龄为:" + getAge() + "的" + getName() + "在吃" + food);
    }
    public void sleep(){
        System.out.println("年龄为:" + getAge() + "的" + getName() + "睡觉~");
    }
}
