package com.yyds.标准代码;

import java.io.*;

public class 高效字节流一次一个字节数组复制文件 {
    public static void main(String[] args) throws IOException {
        //创建流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Day17\\test\\Demo3.java"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Day17\\test\\高效字节流字节数组复制的Demo3"));
        //循环读写
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }

        //关闭流
        bis.close();
        bos.close();
    }
}
