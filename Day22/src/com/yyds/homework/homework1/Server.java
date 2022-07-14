package com.yyds.homework.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建一个ServerSocket,在指定的端口监听
        ServerSocket serverSocket = new ServerSocket(8888);
        //2.使用ServerSocket来监听客户端的请求。如果请求没有来，服务器端在此阻塞
        //如果请求来了，返回一个Socket
        Socket socket = serverSocket.accept();
        //3.接收客户端发来的消息并输出
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream ps = new PrintStream(socket.getOutputStream());
        ps.println("欢迎咨询尚硅谷!");
        System.out.println(br.readLine());
        ps.println("这个月的所有期班都已经满了，只能报下一个月的了！");
        System.out.println(br.readLine());
        //4.给客户端回复消息
        //4.关闭流
        ps.close();
        br.close();
        socket.close();
        serverSocket.close();
    }
}
