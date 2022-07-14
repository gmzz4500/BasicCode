package com.yyds.a_file;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //创建一个File对象
        File file = new File("Day17\\test\\a.txt");
        file.createNewFile();
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getAbsoluteFile() = " + file.getAbsoluteFile());
        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getParent() = " + file.getParent());
        System.out.println("file.toString() = " + file.toString());
        System.out.println("file.lastModified() = " + file.lastModified());
        System.out.println("file.length() = " + file.length());

        File file1 = new File("Day17");
        System.out.println("file1.length() = " + file1.length());

    }
}
