package com.yyds.b_linked;

import java.util.HashMap;
import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        //创建集合
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(4);
        hs.add(3);
        hs.add(2);
        hs.add(1);
        //存取无序:按哈希值算出索引值输出
        System.out.println("hs = " + hs);//1,2,3,4,5

        //创建集合对象
        HashMap<String, String> hm = new HashMap<>();
        hm.put("乔峰","阿朱");
        hm.put("虚竹","梦姑");
        hm.put("段誉","王语嫣");
        //存取无序
        System.out.println("hm = " + hm);//乔峰=阿朱, 段誉=王语嫣, 虚竹=梦姑
    }
}
