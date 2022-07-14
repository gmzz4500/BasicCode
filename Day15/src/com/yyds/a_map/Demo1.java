package com.yyds.a_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        //创建集合
        HashMap<String,String> hm = new HashMap<>();
        System.out.println("hm = " + hm);
        //添加元素
        System.out.println("hm.put(\"乔峰\",\"阿朱\") = " + hm.put("乔峰", "阿朱"));
        System.out.println("hm.put(\"虚竹\",\"梦姑\") = " + hm.put("虚竹", "梦姑"));
        System.out.println("hm.put(\"段誉\",\"王语嫣\") = " + hm.put("段誉", "王语嫣"));
        System.out.println("hm = " + hm);
        //遍历
        //获取键值对象的集合
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //遍历set集合,取出每一个entry对象
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-----" + value);
        }
    }
}
