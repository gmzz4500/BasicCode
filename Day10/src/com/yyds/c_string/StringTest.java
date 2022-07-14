package com.yyds.c_string;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String userName = "admin";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String uName = sc.nextLine();
            System.out.println("请输入密码:");
            String pWord = sc.nextLine();
            System.out.println("请输入验证码(6TU2):");
            String checkWord = sc.nextLine();
            if (userName.equals(uName) && password.equals(pWord) && "6TU2".equalsIgnoreCase(checkWord)) {
                System.out.println("恭喜您,登录成功!");
                break;
            } else {
                if (i == 2){
                    System.out.println("对不起,您已经3次输入有误,账号被锁定,请联系管理员解锁后再登录!");
                    break;
                }
                System.out.println("您的输入有误,请重新输入,再次登录~");
                System.out.println("您还有" + (2 - i) + "次登录机会~");
            }
        }
    }
}
