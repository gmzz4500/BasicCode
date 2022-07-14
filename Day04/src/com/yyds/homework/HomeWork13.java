package com.yyds.homework;

import java.util.Scanner;

/*
    从键盘输入一个英语单词，然后查找这个单词中是否存在'a'字母
 */
public class HomeWork13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个英语单词:");
        String word = sc.next();
        char[] words = word.toCharArray();
        int flag = -1;
        for (int i = 0; i < words.length; i++) {
            if('a' == words[i]){
                flag = i;
                break;
            }
        }
        if(flag == -1){
            System.out.println("这个单词中不存在'a'字母");
        }else{
            System.out.println("这个单词中存在'a'字母");
        }

    }
}
