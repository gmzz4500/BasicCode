//package com.yyds.c_comparater;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class LandLords {
//    public static void main(String[] args) {
//        //先创造一副牌
//        String[] flowers = {"♥", "♠", "♣", "♦"};
//        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
//        ArrayList<String> box = new ArrayList<>();
////        for (int i = 0; i < flower.length; i++) {
////            for (int j = 0; j < number.length - 3; j++) {
////                box.add(flower[i] + number[j]);
////            }
////        }
//        for (String flower : flowers) {
//            for (String number : numbers) {
//                String poke = flower + number;
//                box.add(poke);
//            }
//        }
//
//        box.add("joker");
//        box.add("JOKER");
//        box.add("癞子");
//        System.out.println("box = " + box);
//        //洗牌
//        System.out.println("洗牌");
//        Collections.shuffle(box);
//
//        //牌搭子
//        ArrayList<String> 周润发 = new ArrayList<>();
//        ArrayList<String> 周星驰 = new ArrayList<>();
//        ArrayList<String> 刘德华 = new ArrayList<>();
//        ArrayList<String> 地主牌 = new ArrayList<>();
//
//        //发地主牌
//        地主牌.add(box.get(box.size() - 1));
//        地主牌.add(box.get(box.size() - 2));
//        地主牌.add(box.get(box.size() - 3));
//        地主牌.add(box.get(box.size() - 4));
//
//        //发牌:三个人,所以对3取余,余数0,1,2分别给到一个人
//        for (int i = 0; i < box.size() - 4; i++) {
//            if (i % 3 == 0) {
//                周润发.add(box.get(i));
//            } else if (i % 3 == 1) {
//                周星驰.add(box.get(i));
//            } else {
//                刘德华.add(box.get(i));
//            }
//        }
//
//        //看牌
//        System.out.println("周润发 = " + 周润发);
//        System.out.println("周星驰 = " + 周星驰);
//        System.out.println("刘德华 = " + 刘德华);
//        System.out.println("地主牌 = " + 地主牌);
//
//        //排序
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "3", "4", "5", "6", "7", "8", "9", "1", "J", "Q", "K", "A", "2", "o", "O", "子");
//
//        //创建独立比较器
//        Comparator<String> rule = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //取牌的第2个字符
//                char c1 = o1.charAt(1);
//                char c2 = o2.charAt(1);
//                //把c1和c2在list集合中找到对应的索引
//                int i1 = list.indexOf(c1 + "");
//                int i2 = list.indexOf(c2 + "");
//                return i1 - i2;
//            }
//        };
//
//        //理牌
//        Collections.sort(周润发,rule);
//        Collections.sort(周星驰,rule);
//        Collections.sort(刘德华,rule);
//        Collections.sort(地主牌,rule);
//
//        System.out.println("==============");
//        //看牌
//        System.out.println("周润发 = " + 周润发);
//        System.out.println("周星驰 = " + 周星驰);
//        System.out.println("刘德华 = " + 刘德华);
//        System.out.println("地主牌 = " + 地主牌);
//
//    }
//}
