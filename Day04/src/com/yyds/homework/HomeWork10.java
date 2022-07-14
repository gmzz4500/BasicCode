package com.yyds.homework;

/*
    求出每名学生的最终得分
 */
public class HomeWork10 {
    public static void main(String[] args) {
        char[] answer = {'A', 'D', 'B', 'C', 'D'};
        char[] shang = {'D', 'C', 'B', 'A', 'D'};
        char[] gui = {'A', 'D', 'B', 'C', 'D'};
        char[] gu = {'A', 'D', 'B', 'C', 'A'};
        char[] hao = {'A', 'B', 'C', 'D', 'D'};
        int score = 0;
        for (int i = 0; i < shang.length; i++) {
            if (answer[i] == shang[i]) {
                score += 2;
            }
        }
        int score1 = 0;
        for (int i = 0; i < gui.length; i++) {
            if (answer[i] == gui[i]) {
                score1 += 2;
            }
        }
        int score2 = 0;
        for (int i = 0; i < gu.length; i++) {
            if (answer[i] == gu[i]) {
                score2 += 2;
            }
        }
        int score3 = 0;
        for (int i = 0; i < hao.length; i++) {
            if (answer[i] == hao[i]) {
                score3 += 2;
            }
        }
        System.out.println("小尚的得分为:" + score + "分");
        System.out.println("小硅的得分为:" + score1 + "分");
        System.out.println("小谷的得分为:" + score2 + "分");
        System.out.println("小好的得分为:" + score3 + "分");

    }
}
