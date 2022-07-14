package com.yyds.a_file;

import java.io.File;

public class Demo2 {
    public static void main(String[] args) {
        File file = new File("Day17\\test\\a.txt");
        System.out.println("file.exists() = " + file.exists());

        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isAbsolute() = " + file.isAbsolute());
        System.out.println("file.isHidden() = " + file.isHidden());
    }
}
