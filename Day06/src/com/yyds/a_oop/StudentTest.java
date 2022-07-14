package com.yyds.a_oop;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 18;
        s1.gender = "男";
        s1.eat("热干面");
        s1.sleep();
        s1.study();
        Student s2 = new Student();
        s2.name = "小于";
        s2.age = 23;
        s2.gender = "男";
        s2.eat("肉糕");
        s2.sleep();
        s2.study();
    }
}
