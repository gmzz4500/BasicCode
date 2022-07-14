package com.yyds.socket.demo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client3 {
    public static void main(String[] args) throws IOException {
        //1.创建一个Socket
        //Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        Socket socket = new Socket(InetAddress.getByName("192.168.14.126"),8888);
        PrintStream  ps = new PrintStream(socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Scanner input = new Scanner(System.in); //BufferedReader  readLine(); System.in
        while(true){
            //2.使用Socket来发送一个成语
            //从键盘输入成语
            System.out.println("请输入一个成语：");
            String word = input.nextLine();
            ps.println(word);
            if("3q3q".equals(word)){
                break;
            }
            //3.接收服务器的响应信息并输出
            String result = br.readLine();
            System.out.println("服务器端的响应信息："+result);
        }
        //4.关闭资源
        ps.close();
        br.close();
        input.close();
        socket.close();
    }
}
