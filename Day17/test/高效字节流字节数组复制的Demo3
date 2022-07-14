package com.yyds.a_file;

import java.io.File;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        File file = new File("Day17\\test");
        //获取file对象指向的文件夹中根目录下的所有文件和文件夹
        File[] files = file.listFiles();
        //遍历数组
        for (File f : files) {
            System.out.println("f.getName() = " + f.getName());
        }

        //如果file对象指向的是一个空文件夹:返回的是一个内容为空的数组
        File file1 = new File("Day17\\test\\ccc");
        File[] files1 = file1.listFiles();
        System.out.println("Arrays.toString(files1) = " + Arrays.toString(files1));
        for (File f1 : files1) {
            System.out.println("f1.getName() = " + f1.getName());
        }
        //如果file对象指向的是一个文件:返回的是null
        File file2 = new File("Day17\\test\\a.txt");
        File[] files2 = file2.listFiles();
        System.out.println("files2 = " + files2);
//        for (File f3 : files2) {
//            System.out.println("f3.getName() = " + f3.getName());
//        }
    }
}
