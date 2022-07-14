package com.yyds.homework.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建Socket
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //利用socket发送单词
        PrintStream ps = new PrintStream(socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请你输入要查询的中文(输入-1退出):");
            String chinese = sc.nextLine();
            ps.println(chinese);
            if("-1".equals(chinese)){
                break;
            }
            System.out.println(br.readLine());
        }
        //关闭流
        ps.close();
        br.close();

    }
}
