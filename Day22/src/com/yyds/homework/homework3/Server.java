package com.yyds.homework.homework3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server{
    public static void main(String[] args) throws IOException {
        //开启服务器
        ServerSocket server = new ServerSocket(8888);
        //接收一个客户端的连接
        Socket socket = server.accept();
        //获取输入流
        ObjectInputStream dis = new ObjectInputStream(socket.getInputStream());
        //获取输出流
        PrintStream ps = new PrintStream(socket.getOutputStream());
        //(1)先读取文件名
        String filename = dis.readUTF();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
        Date date = new Date();

        //(2)生成唯一的文件名
        String destfile = "photo" + "/" +  filename + sdf.format(date) + ".jpg";

        //(3)读取文件内容，并写入目标文件
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Day22/" + destfile);
            byte[] data = new byte[1024];
            int len;
            while((len = dis.read(data)) != -1){
                fos.write(data, 0, len);
            }
            //返回结果给客户端
            ps.println("接收成功！");
        } catch (Exception e) {
            //返回结果给客户端
            ps.println("接收失败！");
        }finally{
            fos.close();
        }

        dis.close();
        ps.close();
        socket.close();
        server.close();
    }
}



