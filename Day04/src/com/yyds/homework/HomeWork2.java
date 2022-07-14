package com.yyds.homework;
/*
    打印扑克牌.
 */
public class HomeWork2 {
    public static void main(String[] args) {
        String[] s1 = {"黑桃","红桃","梅花","方片"};
        String[] s2 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[][] s3 = new String[4][13];
//        for (int i = 0; i < s1.length; i++) {
//            for (int j = 0; j < s2.length; j++) {
//                System.out.print(s1[i] + s2[j] + "\t");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                s3[i][j] = s1[i] + s2[j];
                System.out.print(s3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
