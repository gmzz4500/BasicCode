package com.yyds.c_loopinloop;

/*
    循环嵌套打印乘法口诀表
 */
public class LoopInLoopTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int[] arr = {1,4,6,3,7,2,5,8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
