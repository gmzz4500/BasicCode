package com.yyds.a_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
    统计字符串中每个字符出现的次数
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个字符串:");
        String line = sc.nextLine();
        //创建一个集合
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (!hm.containsKey(ch)) {
                hm.put(ch, 1);
            } else {
//                Integer count = hm.get(ch);
                hm.put(ch, hm.get(ch) + 1);
            }
        }
        //keyset遍历
        Set<Character> keys = hm.keySet();
        for (Character key : keys) {
            Integer count = hm.get(key);
            System.out.println("字符 " + key + "在字符串中出现的次数为: " + count);
        }
        //entrySet遍历
        Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            Integer count = entry.getValue();
            System.out.println("字符 " + key + "在字符串中出现的次数为: " + count);
        }
    }
}
