package com.yyds.homework;

public class HomeWork7 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 1;
        int max = a;
//        if(a > b){
//            max = a;
//        }else {
//            max = b;
//        }
//        if(max < c){
//            max = c;
//        }
//        int max = ((a > b ? a : b) > c) ? (a > b ? a : b) : c;
        if (max < b) {
            max = b;
        }else if(max < c){
            max = c;
        }
        System.out.println(max);
    }
}
