package com.yyds.arraytest;

import java.util.Arrays;

/*
    漂亮的打印数组
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.println(arr[i] + "]");
            }else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
