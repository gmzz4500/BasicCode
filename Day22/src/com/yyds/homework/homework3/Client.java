package com.yyds.homework.homework3;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //连接服务器
        Socket socket = new Socket("127.0.0.1", 8888);

        //选择要上传的文件
        Scanner input = new Scanner(System.in);
        System.out.println("请选择要上传的文件：");
        //例如：D:\尚硅谷_0325班_柴林燕_JavaSE\笔记\第14章 IO流.docx
        String fileStr = input.nextLine();
        File file = new File(fileStr);

        if (!fileStr.endsWith(".jpg")) {
            System.out.println("照片必须是.jpg格式");
            input.close();
            socket.close();
            return;
        }
        if (file.length() > 1024 * 1024 * 2) {
            System.out.println("照片必须在2M(含)以内");
            input.close();
            socket.close();
            return;
        }

        //获取输出流
        ObjectOutputStream dos = new ObjectOutputStream(socket.getOutputStream());
        //先发送文件名
        dos.writeUTF(file.getName().substring(0, file.getName().lastIndexOf(".")));

        //从file读取内容，给服务器发送
        FileInputStream fis = new FileInputStream(file);


        //发送文件内容
        byte[] data = new byte[1024];
        int len;
        while ((len = fis.read(data)) != -1) {
            dos.write(data, 0, len);
        }
        socket.shutdownOutput();//告诉服务器，我发送完毕


        //接收结果
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String result = br.readLine();
        System.out.println(result);

        fis.close();
//        dos.close();
        br.close();
        socket.close();
        input.close();
    }

}
