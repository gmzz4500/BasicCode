package com.yyds.b_api;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        //创建随机对象
        //Random r = new Random();
        //Random(long seed)
        Random r = new Random(40);//seed:种子

        //生成10个 1-100 之间的随机数
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(100) + 1;
            System.out.println("num = " + num);
        }
    }
}
