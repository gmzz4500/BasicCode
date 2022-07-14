package com.yyds.homework;


/*
    用二维数组打印扑克牌
 */
public class HomeWork16 {
    public static void main(String[] args) {
        //创建二维数组存储花色和数字
        String[][] s = new String[2][];
        //确定第一行的列数,第一行存储花色
        s[0] = new String[4];
        //确定第二行的列数,第二行存储点数
        s[1] = new String[13];
        //把花色和点数放进去
        //花色
        s[0][0] = "黑桃";
        s[0][1] = "红桃";
        s[0][2] = "梅花";
        s[0][3] = "方片";
        //点数
        s[1][0] = "A";
        for (int i = 1; i <= 9; i++) {
            s[1][i] = i+1 + "";
        }
        s[1][10] = "J";
        s[1][11] = "Q";
        s[1][12] = "K";
        for (int i = 0; i < s[0].length; i++) {
            for (int j = 0; j < s[1].length; j++) {
                System.out.print(s[0][i] + s[1][j] + " ");
            }
            System.out.println();
        }

    }
}
