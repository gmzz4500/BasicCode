package com.yyds.b_stream;

import java.util.ArrayList;
import java.util.Collections;
/*
     #### Stream流综合练习【应用】

- 案例需求

  现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作

  - 男演员只要名字为3个字的前三人
  - 女演员只要姓林的，并且不要第一个
  - 把过滤后的男演员姓名和女演员姓名合并到一起
  - 把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据

  演员类Actor已经提供，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法

  Stream流完成
 */

public class Demo1 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> womanList = new ArrayList<>();

        Collections.addAll(womanList, "林心如", "张曼玉", "林青霞", "柳岩", "林志玲", "王祖贤");
        ArrayList<String> manList = new ArrayList<>();
        Collections.addAll(manList, "周润发", "成龙", "刘德华", "吴京", "周星驰", "李连杰");
        //男演员只要名字为3个字的前三人
        ArrayList<String> manList1 = new ArrayList<>();
        ArrayList<String> manList2 = new ArrayList<>();
        for (int i = 0; i < manList.size(); i++) {
            if (manList.get(i).length() == 3) {
                manList1.add(manList.get(i));
            }
        }
        for (int i = 0; i < manList1.size(); i++) {
            if (i < 3) {
                manList2.add(manList1.get(i));
            }
        }
        for (String s : manList2) {
            System.out.println(s);
        }
//        女演员只要姓林的，并且不要第一个
        ArrayList<String> womanList1 = new ArrayList<>();
        ArrayList<String> womanList2 = new ArrayList<>();

        for (int i = 0; i < womanList.size(); i++) {
            if (womanList.get(i).startsWith("林")) {
                womanList1.add(womanList.get(i));
            }
        }
        for (int i = 1; i < womanList1.size(); i++) {
            womanList2.add(womanList1.get(i));
        }
        for (String s : womanList2) {
            System.out.println(s);
        }
        //把过滤后的男演员姓名和女演员姓名合并到一起
        ArrayList<String> list = new ArrayList<>();
        for (String s : manList2) {
            list.add(s);
        }
        for (String s : womanList2) {
            list.add(s);
        }
        for (String s : list) {
            System.out.println(s);
        }
//        把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
        ArrayList<Actor> actors = new ArrayList<>();
        for (String s : list) {
//            Actor actor = new Actor(s);
            actors.add(new Actor(s));
        }
        for (Actor actor : actors) {
            System.out.println("actor = " + actor);
        }
    }
}
