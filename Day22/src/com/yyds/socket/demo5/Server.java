package com.yyds.socket.demo5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建一个ServerSocket,在指定的端口监听
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("-----服务器已启动-----");
        int i = 0;
        while (true){
            //2.使用ServerSocket来监听客户端的请求。如果请求没有来，服务器端在此阻塞
            Socket socket = serverSocket.accept();
            System.out.println("-------服务器端已经监听到了第"+(++i)+"个客户端的请求,客户端的IP地址"+socket.getInetAddress());
            //如果请求来了，返回一个Socket
            new MyThread(socket).start();
        }
    }
}
