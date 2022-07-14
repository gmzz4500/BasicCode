package com.yyds.socket.demo1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建一个ServerSocker,在指定的端口监听
        ServerSocket serverSocket = new ServerSocket(8888);
        //2.使用ServerSocket来监听客户端的请求。如果请求没有来，服务器端在此阻塞
        //如果请求来了，返回一个Socket
        Socket socket = serverSocket.accept();
        //3.接收客户端发来的消息并输出
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String s = new String(bytes, 0, len);
        System.out.println("客户端的IP地址"+socket.getInetAddress()+",发送的成语是："+s);
        //4.将接收到的数据反转后再发送到客户端
        String s1 = new StringBuilder(s).reverse().toString();
        System.out.println(s1);
        OutputStream os = socket.getOutputStream();

        //5.关闭资源
        os.close();
        os.close();
        socket.close();
        serverSocket.close();
    }
}
