package com.yyds.a_changeargs;

public class Demo {
    public static void main(String[] args) {
        //把数存到数组中
        int[] arr = {1,2,3,4,5};
        int sum = sum("1",2,3,4,5,6,7,8,9);
        System.out.println("sum = " + sum);
    }

    public static int sum(String num,int...arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
