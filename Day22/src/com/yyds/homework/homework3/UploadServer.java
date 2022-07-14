package com.yyds.homework.homework3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UploadServer {
    public static void main(String[] args) throws IOException {
        //1.创建一个ServerSocker,在指定的端口监听
        ServerSocket serverSocket = new ServerSocket(8888);
        //2.使用ServerSocket来监听客户端的请求。如果请求没有来，服务器端在此阻塞
        //如果请求来了，返回一个Socket
        Socket socket = serverSocket.accept();
        //获取输入流
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        //获取输出流
        PrintStream ps = new PrintStream(socket.getOutputStream(), true);
        //先读取文件名
        String filename = ois.readUTF();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        //生成唯一的文件名
        String destfile = "photo" + "/" + filename + sdf.format(date) + ".jpg";
        //读取文件内容,并写入目标文件
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Day22/" + destfile);
            byte[] bytes = new byte[1024];
            int len;
            while ((len = ois.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }
            //返回结果给客户端
            ps.println("接收成功!");
        } catch (IOException e) {
            //返回结果给客户端
            ps.println("接收失败!");
        }finally {
            fos.close();
        }
        //关闭资源
        ois.close();
        ps.close();
        socket.close();
        serverSocket.close();
    }
}
