package com.yyds.a_stringbuilder;

import java.util.Arrays;

public class StringBuilderTest {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3, 4, 5};

        //最简单也最推荐的:Arrays.toString(arr)
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        //利用StringBuilder完成
        StringBuilder sum1 = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sum1.append(arr[i]).append("]");
            } else {
                sum1.append(arr[i]).append(", ");
            }
        }
        //sum1 -> String
        String str1 = sum1.toString();
        System.out.println("str1 = " + str1);

        //一点一点的打印
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
