package com.yyds.homework;

/*
    比较两个数组内容是否完全一致
 */
public class HomeWork8 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 3, 2, 1};
        boolean flag = true;
        if (arr1.length != arr2.length) {
            flag = false;
        }else{
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println("两个数组内容是否一致:" + flag);
    }
}

