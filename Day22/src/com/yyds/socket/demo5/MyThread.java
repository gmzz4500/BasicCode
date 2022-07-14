package com.yyds.socket.demo5;

import java.io.*;
import java.net.Socket;

public class MyThread extends Thread{
    private Socket socket;

    public MyThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedReader br = null;
        PrintStream ps = null;
        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ps = new PrintStream(socket.getOutputStream());
            while (true) {
                //3.接收客户端发来的消息并输出
                String word = br.readLine();
                if ("3q3q".equals(word)) {
                    break;
                }
                System.out.println("客户端的IP地址" + socket.getInetAddress() + ",发送的成语是：" + word);
                //4.将接收到的数据反转后再发送到客户端
                String result = new StringBuilder(word).reverse().toString();
                ps.println(result);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //5.关闭资源
            if (ps != null) {
                ps.close();
            }
            try {
                if(br!=null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(socket!=null){
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
