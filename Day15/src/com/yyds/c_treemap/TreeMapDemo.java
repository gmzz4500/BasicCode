package com.yyds.c_treemap;

import com.yyds.a_map.Student;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        //创建TreeMap集合 学生对象 -- 性别
        //TreeMap(Comparator<K> comparator)
        TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //this:这个this代表队是某个Comparator的不知类名的实现类对象 -> 不代表学生
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println("tm = " + tm);
        //往tm里面添加元素
        tm.put(new Student("Rose",18),"女");
        tm.put(new Student("Jack",20),"男");
        System.out.println("tm = " + tm);
    }
}
