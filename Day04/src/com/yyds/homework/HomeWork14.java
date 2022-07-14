package com.yyds.homework;

import java.util.Random;

/*
* 随机验证码。
* 随机生成十组六位字符组成的验证码。
* 验证码由大小写字母、数字字符组成
 */
public class HomeWork14 {
    public static void main(String[] args) {
        Random r = new Random();
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";
            for (int j = 0; j < 6; j++) {
                int num;
                while(true){
                    num = r.nextInt(123);
                    //数字48-57 小写字母97-122 大写字母65-90
                    if(num>=48&&num<=57){
                        break;
                    }else if (num>=65&&num<=90){
                        break;
                    }else if (num>=97&&num<=122){
                        break;
                    }
                }
                arr[i] += (char)num;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("随机验证码:" + arr[i]);
        }
    }
}
