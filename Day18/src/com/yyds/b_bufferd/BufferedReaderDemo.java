package com.yyds.b_bufferd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建输入流 对象指向源文件
        BufferedReader br = new BufferedReader(new FileReader("Day18\\test\\aaa.txt"));

        String line;
        while ((line = br.readLine()) != null){
            //读到了,不读换行符,所以输出的时候需要加ln
            System.out.println(line);
        }
        //关流
        br.close();
    }
}
