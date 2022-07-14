package com.yyds.a_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Day18\\test\\aaa.txt",true);

        fw.write('a');
        fw.write(97);
        fw.write("\r\n");
        //一次一个字符数组
        char[] chs = {'H','e','l','l','o'};
        fw.write(chs);
        fw.write("\r\n");
        fw.write(chs,1,2);
        fw.write("我想些什么");
        fw.write("\r\n");
        fw.write("马上要下雨了",3,3);
//        fw.flush();
        fw.close();
    }
}
