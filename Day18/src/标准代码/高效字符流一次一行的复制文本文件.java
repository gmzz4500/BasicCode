package 标准代码;

import java.io.*;

public class 高效字符流一次一行的复制文本文件 {
    public static void main(String[] args) throws IOException {
        //创建流对象
        BufferedReader bf = new BufferedReader(new FileReader("Day17\\test\\登鹳雀楼"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Day18\\test\\高效字符流一次一行的复制登鹳雀楼.txt"));

        //循环读写
        String line;
        while ((line=bf.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }
        //关流
        bf.close();
        bw.close();
    }
}
