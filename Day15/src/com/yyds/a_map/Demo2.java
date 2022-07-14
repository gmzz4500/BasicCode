package com.yyds.a_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        //创建集合
        HashMap<String, Student> hm = new HashMap<>();
        //添加元素
        hm.put("001",new Student("张三",18));
        hm.put("002",new Student("李四",19));
        hm.put("003",new Student("王五",20));
//        System.out.println("hm = " + hm);
        //keyset遍历
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println("hm.get(key) = " + hm.get(key));
        }
        //entryset遍历
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            String number = entry.getKey();
            Student student = entry.getValue();
            String name = student.getName();
            int age = student.getAge();
            System.out.println("学号:" + number + " 姓名:" + name + " 年龄:" + age);
        }
    }
}
