package com.yyds.标准代码;

import java.io.*;

public class 高效字节流一次一个字节复制文件 {
    public static void main(String[] args) throws IOException {
        //创建流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Day17\\test\\Demo3.java"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Day17\\test\\高效字节流一次一个字节复制的Demo3"));
        //循环读写
        int by;
        while ((by = bis.read()) != -1){
            bos.write(by);
        }
        //关闭流
        bis.close();
        bos.close();
    }
}
