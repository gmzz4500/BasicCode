package com.yyds.arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("list = " + list);//[]
        list.add("张三丰");
        list.add("张翠山");
        list.add("张无忌");
        list.add("殷素素");
        list.add("赵敏");
        list.add("周芷若");
        System.out.println("list = " + list);
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i).startsWith("张")){
//                list.remove(i);
//                i--;
//            }
//        }
//        System.out.println("list = " + list);
        for (int i = list.size()-1; i >=0; i--) {
            if (list.get(i).startsWith("张")) {
                list.remove(i);
            }
        }
        System.out.println("list = " + list);
    }
}
