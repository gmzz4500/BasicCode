package com.yyds.b_properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

//load
public class Demo2 {
    public static void main(String[] args) throws IOException {
       //准备属性集
        Properties properties = new Properties();
        FileReader fr = new FileReader("Day19\\test\\info.Properties");
        properties.load(fr);
        fr.close();
        //遍历集合
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println(key + "--" + value);
        }
    }
}
