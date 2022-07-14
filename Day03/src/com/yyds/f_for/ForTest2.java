package com.yyds.f_for;

public class ForTest2 {
    public static void main(String[] args) {
        //求1000-1000里的所有水仙花数:三位数,百位,十位,个位的立方和等于这个数的本身
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            //个位
            int a = i % 10;
            //十位
            int b = i / 10 % 10;
            //百位
            int c = i / 100 % 10;
            //求水仙花数
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("100-1000内水仙花数的个数为:" + count);
    }


}
