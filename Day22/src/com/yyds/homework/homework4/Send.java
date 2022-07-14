package com.yyds.homework.homework4;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {
    public static void main(String[] args)throws Exception {
        //创建一个DatagramSocket
        DatagramSocket ds = new DatagramSocket();

        //发送数据
        String str = "欢迎来到尚硅谷";
        byte[] data = str.getBytes();

        for (int i = 0; i <= 255; i++) {
            //把数据包装成一个数据报
            InetAddress ip = InetAddress.getByName("192.168.11."+i);
            int port = 8888;
            DatagramPacket dp = new DatagramPacket(data,data.length,ip,port);

            try {
                //发送数据报
                //通过socket发送
                ds.send(dp);
            } catch (Exception e) {
            }
        }


        //(5)断开
        ds.close();
    }
}

