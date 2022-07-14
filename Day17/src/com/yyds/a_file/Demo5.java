package com.yyds.a_file;

import java.io.File;
import java.io.FileFilter;

public class Demo5 {
    public static void main(String[] args) {
        File file = new File("Day17\\test");
        showFiles(file);
    }
    public static void showFiles(File file){
        //先写出口
        if(file.isFile()){
            System.out.println("文件有: "+ file.getPath());
            return;
        }
        //能下来一定是文件夹
        System.out.println("文件夹有: " + file.getName());
        //带条件的获取子文件/子文件夹
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java") || pathname.isDirectory();
            }
        });
        //遍历
        for (File f : files) {
            showFiles(f);
        }
    }
}
