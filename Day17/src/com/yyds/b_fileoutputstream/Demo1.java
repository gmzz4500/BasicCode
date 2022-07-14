package com.yyds.b_fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    /*
   三种写法:
    void write(int b) : 一次写一个字节
   void write(byte[] bys) : 一次写一个字节数组
   void write(byte[] b, int offset, int length): 一次一个字节数组的一部分
   		int offset: 从数组的哪个索引开始写
   		int length : 写多少个字节

   	如何换行?? -> 往外写换行符 "\r\n"
   	如何写字符串?? String类中 : byte[] getBytes() -> 把字符串转换成字节数组

   	如何追加写?? boolean append : 追加写开关
   	    FileOutputStream(String name, boolean append)
   	    FileOutputStream(File file, boolean append)
 */
        public static void main(String[] args) throws IOException {
            //创建字节输出流对象
            FileOutputStream fos = new FileOutputStream("Day17\\test\\io\\abc.txt",true);

            //写在关流之前
            //一次写一个字节
            fos.write(48);
            fos.write(97);
            fos.write(65);
            fos.write("\r\n".getBytes());
            fos.write("我爱你".getBytes());

            //一次写一个字节数组
            byte[] bys = {48,49,50,51,52};
            fos.write(bys);
            fos.write("\r\n".getBytes());

            //一次写一个字节数组的一部分
            fos.write(bys,1,3);
            fos.write("\r\n".getBytes());

            fos.write("白日依山尽".getBytes());
            fos.write("\r\n".getBytes());

            //关闭流资源
            fos.close();
        }
    }


