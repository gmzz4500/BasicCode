package com.yyds.c_fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //创建一个输入流对象
        FileInputStream fis = new FileInputStream("Day17\\test\\bbb\\Demo.java");
//        int ch = 0;
        FileInputStream(fis);
//        while ((ch=fis.read())!=-1){
//            System.out.print((char)ch);
//        }
        fis.close();
    }

    public static void FileInputStream(FileInputStream fis) throws IOException {
        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);

        }
    }
}
