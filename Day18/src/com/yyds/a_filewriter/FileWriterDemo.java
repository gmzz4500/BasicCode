package com.yyds.a_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建字符输出流对象
        FileWriter fw = new FileWriter("Day18\\test\\aaa.txt", true);
        fw.close();
    }
}
