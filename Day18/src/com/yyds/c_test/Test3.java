package com.yyds.c_test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //创建流
        BufferedReader br = new BufferedReader(
                new FileReader("Day18\\test\\出师表.txt"));

        //准备集合
        ArrayList<String> list = new ArrayList<>();
        //循环读
        String line;
        while ((line = br.readLine()) != null){
            //存集合
            list.add(line);
        }
        //不着急创建输出流
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("Day18\\test\\出师表.txt"));

        //对集合进行排序
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                String[] split1 = o1.split("\\.");
//                String[] split2 = o2.split("\\.");
//                //取出0索引的编号
//                String s1 = split1[0];
//                String s2 = split2[0];
//                //字符串的编号变成int
//                int i1 = Integer.parseInt(s1);
//                int i2 = Integer.parseInt(s2);
//                return i1 - i2;
//            }
//        });
        //对集合进行排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.split("\\.")[0]) - Integer.parseInt(o2.split("\\.")[0]);
            }
        });
        //遍历集合
        for (String s : list) {
            //写回文件
            bw.write(s);
            //换行
            bw.newLine();
        }

        //关流
        br.close();
        bw.close();
    }
}
