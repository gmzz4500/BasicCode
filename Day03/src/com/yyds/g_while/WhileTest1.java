package com.yyds.g_while;

/*
    用while循环求水仙花数
 */
public class WhileTest1 {
    public static void main(String[] args) {
        int i = 100;
        int count = 0;
        while (i < 1000) {
            //个位
            int a = i % 10;
            //十位
            int b = i / 10 % 10;
            //百位
            int c = i / 100 % 10;
            if (a * a * a + b * b * b + c * c * c == i){
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("水仙花个数为:" + count);
    }
}
