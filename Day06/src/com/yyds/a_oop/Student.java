package com.yyds.a_oop;

public class Student {
    //名字属性
    String name;
    //年龄属性
    int age;
    //性别属性
    String gender;

    //吃饭的方法
    public void eat(String food) {
        System.out.println("学生" + name + "在吃" + food);
    }

    //睡觉的方法
    public void sleep() {
        System.out.println("学生" + name + "在睡觉~");
    }//学习的方法

    public void study() {
        System.out.println("学生" + name + "在学习~");
    }
}
