package com.yyds.f_for;

public class ForTest1 {
    public static void main(String[] args) {
        //定义求和变量
        int sum = 0;
        //求1-100的偶数和
        for (int i = 1; i <= 100; i++) {
            //找出1-100里的偶数
            if(i % 2 == 0){
                //求和
                sum += i;
            }
        }
        System.out.println("1-100的偶数和为" + sum);
    }
}
