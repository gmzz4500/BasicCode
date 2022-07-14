package com.yyds.f_array;

public class ArrayTest {
    public static void main(String[] args) {
        //动态初始化数组
        int[] arr = new int[10];
        //静态初始化数组
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);

        }
    }
}
