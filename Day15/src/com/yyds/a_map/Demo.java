package com.yyds.a_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        //创建集合
        Map<String,String> map = new HashMap<>();
        System.out.println("map = " + map);
        //添加元素
        System.out.println("map.put(\"邓超\",\"孙俪\") = " + map.put("邓超", "孙俪"));
        System.out.println("map.put(\"张杰\",\"谢娜\") = " + map.put("张杰", "谢娜"));
        System.out.println("map.put(\"吴京\",\"谢楠\") = " + map.put("吴京", "谢楠"));
        System.out.println("map = " + map);
//        //删除元素
//        System.out.println("map.remove(\"张杰\") = " + map.remove("张杰"));
//        System.out.println("map.remove(\"邓超\",\"孙俪\") = " + map.remove("邓超", "孙俪"));
//        System.out.println("map = " + map);
//        //清空
//        map.clear();
//        System.out.println("map = " + map);
        //查
        String s = map.get("张杰");
        System.out.println("s = " + s);
        //遍历
        //召集所有的key
        Set<String> keys = map.keySet();
        //用key去找value
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "----" + value);
        }
    }
}
