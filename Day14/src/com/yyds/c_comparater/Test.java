package com.yyds.c_comparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        //准备一副牌
        String[] flowers = {"红桃","黑桃","梅花","方片"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        //准备牌盒
        ArrayList<String> box = new ArrayList<>();

        //把牌装进牌盒
        for (String flower : flowers) {
            for (String number : numbers) {
                String poke = flower + number;
                box.add(poke);
            }
        }

        //大小王和癞子单独放进去,因为它们跟花色无关
        box.add("king");
        box.add("KING");
        box.add("癞 子");

        //看一下
        System.out.println("洗牌前: " + box);

        //洗牌
        Collections.shuffle(box);

        //洗完牌再看一下
        System.out.println("洗牌后: " + box);

        //搭牌架子
        ArrayList<String> 周润发 = new ArrayList<>();
        ArrayList<String> 周星驰 = new ArrayList<>();
        ArrayList<String> 刘德华 = new ArrayList<>();
        ArrayList<String> 地主牌 = new ArrayList<>();

        //发牌
        //地主牌是最后的四张
        地主牌.add(box.get(box.size()-1));
        地主牌.add(box.get(box.size()-2));
        地主牌.add(box.get(box.size()-3));
        地主牌.add(box.get(box.size()-4));
        //其余的3个人平分
        for (int i = 0; i < box.size() - 4; i++) {
            if (i % 3 == 0){
                周润发.add(box.get(i));
            }else if (i % 3 == 1){
                周星驰.add(box.get(i));
            }else{
                刘德华.add(box.get(i));
            }
        }

        //看下牌
        System.out.println("周润发 = " + 周润发);
        System.out.println("周星驰 = " + 周星驰);
        System.out.println("刘德华 = " + 刘德华);
        System.out.println("地主牌 = " + 地主牌);

        //理牌
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"3","4","5","6","7","8","9","1","J","Q","K","A","2","n","N","子");
//        Comparator<String> rule = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return list.indexOf(o1.charAt(2)+"") - list.indexOf(o2.charAt(2)+"");
//            }
//        };
        Comparator<String> rule = (o1,o2) -> list.indexOf(o1.charAt(2)+"") - list.indexOf(o2.charAt(2)+"");
        Collections.sort(周润发,rule);
        Collections.sort(周星驰,rule);
        Collections.sort(刘德华,rule);
        Collections.sort(地主牌,rule);

        //看牌
        System.out.println("周润发 = " + 周润发);
        System.out.println("周星驰 = " + 周星驰);
        System.out.println("刘德华 = " + 刘德华);
        System.out.println("地主牌 = " + 地主牌);
    }
}
