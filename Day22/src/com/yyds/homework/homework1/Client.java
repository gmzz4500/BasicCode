package com.yyds.homework.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建一个socket
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //2.使用socket发送一句话
        PrintStream ps = new PrintStream(socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(InetAddress.getLocalHost() + "留言:" + sdf.format(date));
        ps.println("你好，我想报名这个月的JavaEE就业班");
        System.out.println(br.readLine());
        System.out.println(InetAddress.getLocalHost() + "留言:" + sdf.format(date));
        ps.println("好的，赶紧给我占个座！");
        System.out.println(br.readLine());
        //3.关闭流
        ps.close();
        br.close();
        socket.close();
    }
}
