package com.yyds.a_file;

import java.io.File;
import java.io.FileFilter;

public class Demo4 {
    public static void main(String[] args) {
        //创建File对象
        File file = new File("Day17\\test");
        //带条件的过滤
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java") || pathname.isDirectory();
            }
        });
        for (File f : files) {
            System.out.println("f.getName() = " + f.getName());
        }
    }
}
