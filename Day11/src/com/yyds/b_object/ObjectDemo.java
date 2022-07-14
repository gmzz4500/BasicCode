package com.yyds.b_object;

import java.util.Objects;

/*
    1.私有所有属性
    2.生成无参构造
    3.生成全参构造
    4.生成getter 和 setter 方法
    5.自动生成equals() 和 hashCode()方法
    6.快捷键重写toString()

    结论 :直接输出对象 就是 在输出对象.toString()


    toString方法源码
    return this.getClass().getName() +      "@" + Integer.toHexString(hashCode());
           com.atguigu.b_object.Student @    4554617c
     @的左边
        getClass() : 获取对象的字节码对象(字节码对象是根据字节码文件来的)
        对象的字节码对象.getName() : 获取对象的 全类名
     @ : 分隔符号 没有意义
     @的右边
         Integer.toHexString(this.hashCode())
            this.hashCode() : 获取对象的哈希值 -> 一般情况下对象的哈希值就是对象的10进制地址值
            Integer.toHexString(十进制地址值)  : 把传入的10进制数转换成16进制数

    需求: 如果你想输出对象的时候看到的不是对象的全类名@对象的地址值,而是想看对象的属性值
        解决方案 : 那么请重写父类的toString方法

    为什么有时候输出对象看到的不是对象的地址值而是对象的属性值 : 原因是对象所在的类重写了父类的toString()方法
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student student = new Student("张三",18);
        System.out.println(student);//student.toString
        System.out.println("student.hashCode() = " + student.hashCode());//十进制的数
        System.out.println(student.toString());//对象.toString
    }
}
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}