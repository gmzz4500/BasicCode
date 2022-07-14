package com.yyds.arraytest;

import java.util.Arrays;

/*
    翻转数组
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("翻转前: " + Arrays.toString(arr));
        for (int i = 0,j = arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("翻转后: " + Arrays.toString(arr));
    }
}
