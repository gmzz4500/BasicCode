package com.yyds.a_printerwriter;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        //创建一个超级输出流对象
        //追加写:FileOutputStream,FileWriter
        //设置写的编码格式:OutputStreamWriter
        //高效:Buffered
        //转换:OutputStreamWriter
        //自动刷新,自动换行:PrintWriter

        PrintWriter pw = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("目标文件地址", true), "GBK")), true);
        pw.println();
        pw.close();
    }
}
