package com.yyds.c_fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("Day17\\test\\io\\abc.txt");
        int by;
        while ((by = fis.read()) != -1){
            System.out.print("by = " + (char)by);
        }
        fis.close();
    }
}
