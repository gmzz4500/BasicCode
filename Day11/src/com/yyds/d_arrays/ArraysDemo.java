package com.yyds.d_arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr1 = new int[10];
        Arrays.fill(arr,1);
        System.out.println(Arrays.toString(arr));
        int[] arr2 =Arrays.copyOf(arr, 5);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
    }
}
