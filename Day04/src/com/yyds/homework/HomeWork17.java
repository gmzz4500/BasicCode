package com.yyds.homework;

import java.util.Scanner;

/*
    对全班成绩做统计
 */
public class HomeWork17 {
    public static void main(String[] args) {
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入全班一共有多少组:");
        int group = sc.nextInt();
        int[][] arr = new int[group][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"组人数:");
            arr[i] = new int[sc.nextInt()];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("请输入第"+(j+1)+"个组员的成绩");
                arr[i][j] = sc.nextInt();
            }
        }
        //打印成绩表
        System.out.println("每组成绩如下:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        //统计每一组的最高分、最低分
        int[] groupMax = new int[group];
        int[] groupMin = new int[group];
        double[] groupAvg = new double[group];
        int max = -1;
        int min = 101;
        double sum = 0;
        int count = 0;

        for (int i = 0; i < group; i++) {
            groupMax[i] = max;
            groupMin[i] = min;
        }

        for (int i = 0; i < arr.length; i++) {
            double groupSum = 0;//每一组累计总分都是从0开始
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>groupMax[i]){
                    groupMax[i] = arr[i][j];
                }
                if(arr[i][j]<groupMin[i]){
                    groupMin[i] = arr[i][j];
                }
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
                groupSum += arr[i][j];
                sum += arr[i][j];
                count++;
            }
            //每一组的平均分
            groupAvg[i] = groupSum / arr[i].length;
        }
        //全部的平均分
        double avg = sum / count;
        System.out.println("全班的最高分：" + max);
        System.out.println("全班的最低分：" + min);
        System.out.println("全班的平均分：" + avg);
        System.out.println("全班的总人数：" + count);
        for(int i=0; i<arr.length; i++){
            System.out.println("第" + (i+1) + "组的最高分：" + groupMax[i]);
            System.out.println("第" + (i+1) + "组的最低分：" + groupMin[i]);
            System.out.println("第" + (i+1) + "组的平均分：" + groupAvg[i]);
        }
    }

}
