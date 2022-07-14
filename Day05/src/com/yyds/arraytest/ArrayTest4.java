package com.yyds.arraytest;
/*
    不死神兔
    斐波那契数列
    1,1,2,3,5,8,13,21...
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        //创建数组
        int[] arr = new int[20];
        //给数组前两个数赋值
        arr[0] = 1;
        arr[1] = 1;
        //遍历数组
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println("第二十个月的兔子对数: " + arr[19]);
    }
}
