package com.yyds.homework;

import java.util.Scanner;

/*
    从键盘输入生日，判断星座
 */
public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入月份:");
        int month = sc.nextInt();
        System.out.print("请输入日期:");
        int day = sc.nextInt();
        switch (month) {
            case 1:
                if (day >= 1 && day <= 19) {
                    System.out.println("生日" + month + "月" + day + "日是摩羯座");
                }else if(day>=20&&day<=31){
                    System.out.println("生日" + month + "月" + day + "日是水瓶座");
                }else{
                    System.out.println("输入有误!");
                }
                break;
            case 2:
                if (day >= 1 && day <= 18) {
                    System.out.println("生日" + month + "月" + day + "日是水瓶座");
                }else if(day>=19&&day<=28){
                    System.out.println("生日" + month + "月" + day + "日是双鱼座");
                }else{
                    System.out.println("输入有误!");
                }
                break;
            case 3:
                if (day >= 21 && day <= 31) {
                    System.out.println("生日" + month + "月" + day + "日是白羊座");
                } else if (day >= 1 && day <= 20) {
                    System.out.println("生日" + month + "月" + day + "日是双鱼座");
                }else{
                    System.out.println("输入有误!");
                }
                break;
            case 4:
                if (day >= 1 && day <= 19) {
                    System.out.println("生日" + month + "月" + day + "日是白羊座");
                }else if(day>=20&&day<=30){
                    System.out.println("生日" + month + "月" + day + "日是金牛座");
                }else{
                    System.out.println("输入有误!");
                }
                break;
            case 5:
                if (day >= 1 && day <= 20) {
                    System.out.println("生日" + month + "月" + day + "日是金牛座");
                }else if(day>=21&&day<=31){
                    System.out.println("生日" + month + "月" + day + "日是双子座");
                }else{
                    System.out.println("输入有误!");
                }
                break;
            case 6:
                if (day >= 1 && day <= 21) {
                    System.out.println("生日" + month + "月" + day + "日是双子座");
                }else if(day>=22&&day<=30){
                    System.out.println("生日" + month + "月" + day + "日是巨蟹座");
                }else{
                    System.out.println("输入有误!");
                }
                break;
            case 7:
                if (day >= 1 && day <= 22) {
                    System.out.println("生日" + month + "月" + day + "日是巨蟹座");
                }else if(day>=23&&day<=31){
                    System.out.println("生日" + month + "月" + day + "日是狮子座");
                }else{
                    System.out.println("输入有误!");
                }
                break;
            case 8:
                if (day >= 1 && day <= 22) {
                    System.out.println("生日" + month + "月" + day + "日是狮子座");
                }else if(day>=23&&day<=31){
                    System.out.println("生日" + month + "月" + day + "日是处女座");
                }else{
                    System.out.println("输入有误!");
                }
                break;
            case 9:
                if (day >= 1 && day <= 22) {
                    System.out.println("生日" + month + "月" + day + "日是处女座");
                }else if(day>=23&&day<=30){
                    System.out.println("生日" + month + "月" + day + "日是天秤座");
                }else{
                    System.out.println("输入有误!");
                }
                break;
            case 10:
                if (day >= 1 && day <= 23) {
                    System.out.println("生日" + month + "月" + day + "日是天秤座");
                }else if(day>=24&&day<=31){
                    System.out.println("生日" + month + "月" + day + "日是天蝎座");
                }else{
                    System.out.println("输入有误!");
                }
                break;
            case 11:
                if (day >= 1 && day <= 22) {
                    System.out.println("生日" + month + "月" + day + "日是天蝎座");
                }else if(day>=23&&day<=30){
                    System.out.println("生日" + month + "月" + day + "日是射手座");
                }else{
                    System.out.println("输入有误!");
                }
                break;
            case 12:
                if (day >= 1 && day <= 21) {
                    System.out.println("生日" + month + "月" + day + "日是射手座");
                }else if(day>=22&&day<=31){
                    System.out.println("生日" + month + "月" + day + "日是摩羯座");
                }else{
                    System.out.println("输入有误!");
                }
                break;
        }

    }
}
