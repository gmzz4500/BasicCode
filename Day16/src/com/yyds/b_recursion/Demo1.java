package com.yyds.b_recursion;

import java.util.Arrays;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
//        int[] arr = {8, 2, 9, 6, -1, 10, 20, 1, 24, 3, 9};
        Random r = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10001);
        }
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int startNum, int endNum) {
        if (startNum < endNum) {
            int index = findBaseNum(arr, startNum, endNum);

            quickSort(arr, startNum, index - 1);
            quickSort(arr, index + 1, endNum);
        }
    }

    public static int findBaseNum(int[] arr, int start, int end) {
        int temp = arr[start];
        while (start < end) {
            while (start < end && arr[end] >= temp) {
                end--;
            }
            arr[start] = arr[end];
            while (start < end && arr[start] <= temp) {
                start++;
            }
            arr[end] = arr[start];
        }
        arr[start] = temp;
        return start;
    }
}
