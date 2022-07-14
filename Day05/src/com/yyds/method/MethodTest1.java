package com.yyds.method;

import java.util.Scanner;

/*
    用方法实现 裁判打分案例
 */
public class MethodTest1 {
    public static void main(String[] args) {
        //创建数组,存储评委的打分
        int[] scores = new int[6];
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        //提示
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位裁判的打分(1-10):");
            //键盘录入
            scores[i] = sc.nextInt();
        }
        int sum = sum(scores);
        int max = getMax(scores);
        int min = getMin(scores);
        //求选手的最终得分
        double avg = (sum - max - min) * 1.0 / (scores.length - 2);
        System.out.println("选手的得分是:" + avg);
    }
    //求和
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    //求最大值
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    //求最小值
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
