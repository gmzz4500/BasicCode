package com.yyds.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合
        List<String> list = new ArrayList<>();
        System.out.println("list = " + list);
        //添加元素
        list.add("张三丰");
        list.add("灭绝师太");
        list.add("张翠山");
        list.add("殷素素");
        list.add("张无忌");
        list.add("小昭");
        System.out.println("list = " + list);

        //转数组
        Object[] objs = list.toArray();
        for (Object obj : objs) {
            System.out.println("name = " + obj);
        }
        System.out.println("=================");
        //转数组
        Object[] objs2 = list.toArray();
        for (int i = 0; i < objs2.length; i++) {
            String s = (String) objs2[i];
            System.out.println("name = " + s);
        }
        System.out.println("==================");

        //迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String name = it.next();
            System.out.println("name = " + name);
        }
        System.out.println("=================");
        //增强for循环
        for (String s : list) {
            System.out.println("name = " + s);
        }
        System.out.println("=================");
        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println("name = " + list.get(i));
        }
        System.out.println("=================");
        //列表迭代器
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String name = lit.next();
            System.out.println("name = " + name);
        }
    }
}
