package com.yyds.e_test;

import com.yyds.a_map.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap中装ArrayList
        HashMap<班级名称,班级> -> HashMap<String,ArrayList<Student>>
 */
public class Test1 {
    public static void main(String[] args) {
        //外层集合
        HashMap<String, ArrayList<Student>> school = new HashMap<>();

        //准备班级集合
        ArrayList<Student> base = new ArrayList<>();
        base.add(new Student("乔峰", 20));
        base.add(new Student("虚竹", 19));
        base.add(new Student("段誉", 18));
        ArrayList<Student> job = new ArrayList<>();
        job.add(new Student("郭靖", 30));
        job.add(new Student("金轮法王", 35));
        job.add(new Student("杨过", 18));
        //添加班级到学校集合
        school.put("基础班",base);
        school.put("就业班",job);
        //keySet遍历
        Set<String> classNames = school.keySet();
        for (String className : classNames) {
            //根据班级名称获取班级集合
            ArrayList<Student> clazz = school.get(className);
            //遍历班级集合
            for (Student student : clazz) {
                //取出学生属性信息
                String name = student.getName();
                int age = student.getAge();
                System.out.println("班级名称: " + className + ",学生姓名: " + name + " 学生年龄: " + age);
            }
        }
        System.out.println("==============================");
        //entrySet遍历
        //取出班级名称集合
        Set<Map.Entry<String, ArrayList<Student>>> entries = school.entrySet();
        //根据班级名称取出班级集合
        for (Map.Entry<String, ArrayList<Student>> entry : entries) {
            String className = entry.getKey();
            ArrayList<Student> clazz = entry.getValue();
            //遍历班级集合
            for (Student student : clazz) {
                //取出学生属性信息
                String name = student.getName();
                int age = student.getAge();
                System.out.println("班级名称: " + className + ",学生姓名: " + name + " 学生年龄: " + age);
            }
        }
    }
}
