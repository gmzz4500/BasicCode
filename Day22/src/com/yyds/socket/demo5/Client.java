package com.yyds.socket.demo5;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建一个socket
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        //2.使用Socket来发送一个成语
        PrintStream ps = new PrintStream(socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入一个成语:");
            String word = sc.nextLine();
            ps.println(word);
            if ("3q3q".equals(word)){
                break;
            }
            //3.接收服务端的响应信息并输出
            String result = br.readLine();
            System.out.println("客户端响应为:" + result);
        }

        //4.关闭资源
        br.close();
        ps.close();
        socket.close();
        sc.close();
    }
}
