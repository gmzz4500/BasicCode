package com.yyds.c_test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("guigu005","周慧敏","20","女"));
        list.add(new Student("guigu006","张敏","19","女"));
        list.add(new Student("guigu007","朱茵","21","女"));
        list.add(new Student("guigu008","李嘉欣","22","女"));
        //创建输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("Day18\\test\\studentInfo.txt",true));
        //把集合的内容写到文件中,追加写
        for (Student student : list) {
            StringBuilder sb = new StringBuilder();
            sb.append(student.getSid()).append(",")
                    .append(student.getName()).append(",")
                        .append(student.getAge()).append(",")
                            .append(student.getGender());
            //输出流写数据
            bw.write(sb.toString());
            //换行
            bw.newLine();
        }
        //关闭流资源
        bw.close();
    }
}
