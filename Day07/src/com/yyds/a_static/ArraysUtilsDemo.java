package com.yyds.a_static;

public class ArraysUtilsDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,4,3,2,1};
        System.out.println("工具类的作者是:" + ArraysUtils.author);
        System.out.println("ArraysUtils.sum(arr) = " + ArraysUtils.sum(arr));
        System.out.println("ArraysUtils.getMax(arr) = " + ArraysUtils.getMax(arr));
        System.out.println("ArraysUtils.getMin(arr) = " + ArraysUtils.getMin(arr));
        System.out.println("ArraysUtils.firstIndex(arr,5) = " + ArraysUtils.firstIndex(arr, 5));
        System.out.println("ArraysUtils.lastIndex(arr,1) = " + ArraysUtils.lastIndex(arr, 1));
        ArraysUtils.printArray(arr);
        ArraysUtils.sortArray(arr);
        ArraysUtils.reversalArray(arr);
    }
}
