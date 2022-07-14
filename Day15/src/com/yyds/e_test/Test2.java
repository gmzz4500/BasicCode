package com.yyds.e_test;

import com.yyds.a_map.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap套HashMap,
    HashMap<班级名称,班级> HashMap<学号,Student> -> HashMap<String,HashMap<String,Student>>
 */
public class Test2 {
    public static void main(String[] args) {
        //外层集合
        HashMap<String, HashMap<String, Student>> school = new HashMap<>();

        //准备班级集合
        HashMap<String, Student> base = new HashMap<>();
        //添加学生
        base.put("001",new Student("张三丰",99));
        base.put("002",new Student("郭襄",80));
        base.put("003",new Student("杨过",100));
        HashMap<String, Student> job = new HashMap<>();
        //添加学生
        job.put("004",new Student("乔峰",30));
        job.put("005",new Student("虚竹",25));
        job.put("006",new Student("段誉",22));
        //把班级集合对象装入学校集合
        school.put("基础班",base);
        school.put("就业班",job);
        //keySet遍历外层
        Set<String> classNames = school.keySet();
        for (String className : classNames) {
            //根据班级名称取得班级集合对象
            HashMap<String, Student> clazz = school.get(className);
            //仍然是HashMap,用entrySet来遍历
            //首先取得键集合
            Set<Map.Entry<String, Student>> entries = clazz.entrySet();
            for (Map.Entry<String, Student> entry : entries) {
                //根据键来取值
                String sid = entry.getKey();//学号
                Student student = entry.getValue();//学生对象
                String name = student.getName();
                int age = student.getAge();
                System.out.println("班级名称: " + className + " ,学生学号: " + sid + " ,学生姓名: " + name + ", 学生年龄: " + age);
            }
        }
    }
}
