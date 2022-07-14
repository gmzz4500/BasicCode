package com.yyds.homework;

/*
    统计高于平均分的分数有多少个
 */
public class HomeWork5 {
    public static void main(String[] args) {
        int[] arr = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int count = 0;
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println("平均分为:" + avg);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }
        System.out.println("高于平均分的有:" + count + "个");
    }
}
