package com.yyds.enums;

public class TestSeason {
    public static void main(String[] args) {
        Season season = Season.春;
        switch (season) {
            case 春:
                System.out.println("春暖花开");
                break;
            case 夏:
                System.out.println("夏日炎炎");
                break;
            case 秋:
                System.out.println("秋高气爽");
                break;
            case 冬:
                System.out.println("寒冬凛凛");
                break;
        }
    }
}
