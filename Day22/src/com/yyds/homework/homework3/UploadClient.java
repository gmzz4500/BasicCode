package com.yyds.homework.homework3;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class UploadClient {
    public static void main(String[] args) throws IOException {
        //创建一个socket
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //选择要上传的文件
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择要上传的文件:");
        String fileStr = sc.nextLine();
        File file = new File(fileStr);

        //进行判断
        if(!fileStr.endsWith(".jpg")){
            System.out.println("照片必须是.jpg格式");
            sc.close();
            socket.close();
            return;
        }
        if (file.length() > 1024 * 1024 * 2){
            System.out.println("照片必须在2M或以内");
            sc.close();
            socket.close();
            return;
        }
        //获取输出流
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        //先发送文件名
        oos.writeUTF(file.getName().substring(0,file.getName().lastIndexOf(".")));
        //从file读取内容,给服务器发送
        FileInputStream fis = new FileInputStream(file);

        //发送文件内容
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1){
            oos.write(bytes,0,len);
        }
        socket.shutdownOutput();//告诉服务器,我发送完毕
        //接收结果
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String result = br.readLine();
        System.out.println(result);

        //关闭流
        fis.close();
//        oos.close();
        br.close();
        socket.close();
        sc.close();

    }
}
