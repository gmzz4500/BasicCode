package com.yyds.标准代码;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节流一次一个字节数组复制文件 {
    public static void main(String[] args) throws IOException {
     //创建对象
        FileInputStream fis = new FileInputStream("Day17\\test\\Demo3.java");
        FileOutputStream fos = new FileOutputStream("Day17\\test\\字节流数组复制的Demo3.java");
        //循环读写
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }
        //关闭流
        fis.close();
        fos.close();
    }
}
