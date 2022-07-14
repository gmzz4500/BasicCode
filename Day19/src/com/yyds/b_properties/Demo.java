package com.yyds.b_properties;

import java.util.Properties;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        //使用properties特有的方法操作双列集合
        Properties prop = new Properties();
        System.out.println("prop = " + prop);
        //添加元素
        prop.setProperty("张三","18");
        prop.setProperty("李四","20");
        prop.setProperty("王五","20");
        System.out.println("prop = " + prop);
        //遍历
        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            //键找值
            String value = prop.getProperty(key);
            System.out.println(key + "----" + value);
        }
    }
}
