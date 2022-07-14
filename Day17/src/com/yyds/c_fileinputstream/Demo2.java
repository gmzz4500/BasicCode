package com.yyds.c_fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Day17\\test\\Demo3.java");
        method(fis);

    }

    public static void method(FileInputStream fis) throws IOException {
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1){
            String line = new String(bys,0,len);
            System.out.print("line = " + line);
        }
        System.out.println(len);
        fis.close();
    }


}
