package com.yyds.c_fileinputstream;

import java.io.*;

    public class Demo5 {
        public static void main(String[] args) throws IOException {
            //创建输入,输出对象
            File file = new File("Day17\\test");
            showFile(file);
        }

        public static void showFile(File fl) throws IOException {
            //文件遍历
            if (fl.isFile()){
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fl));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Day17\\src" + fl.getName()));
                byte[] bys = new byte[1024];
                int len;
                while((len = bis.read(bys)) != -1){
                    bos.write(bys,0,len);
                }
                bis.close();
                bos.close();
                return;
            }
            //文件夹
            File[] files = fl.listFiles();
            for (File file : files) {
                showFile(file);
            }
        }
    }
