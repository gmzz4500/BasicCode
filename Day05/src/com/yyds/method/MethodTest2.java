package com.yyds.method;

import java.util.Scanner;

/*
    用方法 实现评委打分的案例
 */
public class MethodTest2 {
    public static void main(String[] args) {
        //创建键盘输入的对象
        Scanner sc = new Scanner(System.in);
        //创建一个数组,存储评委打分
        int[] arr = new int[6];
        //键盘录入评委打分
        for (int i = 0; i < arr.length; i++) {
            //提示
            System.out.println("请您输入第" + (i + 1) + "个评委打的分数(1-10):");
            //键盘录入
            arr[i] = sc.nextInt();
        }
        int sum = sum(arr);
        int max = getMax(arr);
        int min = getMin(arr);
        double avg = (sum - max - min)* 1.0 / (arr.length - 2);
        System.out.println("该同学的最终得分是:" + avg);

    }
    //求总分
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
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    //求最小值
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

}
