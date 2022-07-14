package com.yyds.a_printerwriter;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //创建流对象
        BufferedReader br = new BufferedReader(new FileReader("Day19\\test\\出师表.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("Day19\\test\\出师表.java"));
        //循环读写
        String line;
        while ((line = br.readLine()) != null){
            //写出去
            pw.println(line);
        }

        //关流
        br.close();
        pw.close();
    }
}
