package com.yyds.socket.demo1;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Properties;

public class client {
    public static void main(String[] args) throws IOException {
        //创建一个socket
        Socket socket = new Socket(InetAddress.getByName("192.168.14.90"), 8888);
        //2.使用Socket来发送一个成语
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//        bw.write("前途似锦");
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("Day22\\1.properties");
        properties.load(fileReader);
        //3.接收服务端的响应
//        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//////        byte[] bytes = new byte[1024];
//////        int len = is.read(bytes);
//////        String s = new String(bytes, 0, len);
//        String s = br.readLine();
//        System.out.println("服务器端发过来的响应:"+ s);
////        //4.关闭资源
//        br.close();
        fileReader.close();
        bw.close();
        socket.close();
    }
}
