package com.yyds.b_properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
//store
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //准备一个属性集集合
        Properties properties = new Properties();
        //往集合中存储属性
        properties.setProperty("Date","2022年03月15日");
        properties.setProperty("Version","1.0");
        properties.setProperty("Author","yyds");

        FileWriter fw = new FileWriter("Day19\\test\\info.Properties");

        //一键存储的功能
        properties.store(fw,"你好");

        fw.close();
    }
}
