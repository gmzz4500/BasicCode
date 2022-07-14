package com.yyds.c_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //读取文件信息,并拆分,给学生对象赋值
        BufferedReader br = new BufferedReader(new FileReader("Day18\\test\\studentInfo.txt"));

        //创建集合对象
        ArrayList<Student> list = new ArrayList<>();

        //一次读一行
        String line;
        while ((line = br.readLine()) != null){
            //读到了数据
            String[] split = line.split(",");
            //获取到的学生信息赋值给学生对象
            Student student = new Student(split[0], split[1], split[2], split[3]);
            //把学生对象添加到集合中
            list.add(student);
        }

        //关流
        br.close();
        //不需要流了,遍历集合取出学生信息
        for (Student student : list) {
            System.out.println("student = " + student);
        }
    }
}
