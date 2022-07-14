package com.yyds.标准代码;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节流一次一个字节复制文件 {
    public static void main(String[] args) throws IOException {
        //创建流
        FileInputStream fis = new FileInputStream("Day17\\test\\Demo3.java");
        FileOutputStream fos = new FileOutputStream("Day17\\test\\复制来的Demo3.java");
        int by;
        while((by = fis.read()) != -1){
            fos.write(by);
        }

        //关流
        fis.close();
        fos.close();
    }
}
