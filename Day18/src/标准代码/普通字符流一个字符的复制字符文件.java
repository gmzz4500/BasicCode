package 标准代码;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 普通字符流一个字符的复制字符文件 {
    public static void main(String[] args) throws IOException {
        //创建流对象
        FileReader fr = new FileReader("Day17\\test\\登鹳雀楼");
        FileWriter fw = new FileWriter("Day18\\test\\普通字符流一次一个字符的的复制登鹳雀楼");
        //循环读取
        int ch;
        while ((ch=fr.read())!=-1){
            fw.write(ch);
            fw.flush();
        }
        fr.close();
        fw.close();
    }
}
