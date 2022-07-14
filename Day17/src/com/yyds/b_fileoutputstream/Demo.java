package com.yyds.b_fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Day17\\test\\io\\abc.txt");
        fos.close();
    }
}
