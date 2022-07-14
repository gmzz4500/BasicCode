package com.yyds.homework.homework4;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
    public static void main(String[] args)throws Exception {
        //准备一个socket，用来接收消息
        DatagramSocket ds = new DatagramSocket(8888);

        //准备一个数据报，来接收数据
        //DatagramPacket(byte[] buf, int length)
        byte[] data = new byte[1024*64];//64K
        DatagramPacket dp = new DatagramPacket(data,data.length);

        //3、接收数据
        ds.receive(dp);

        byte[] result = dp.getData();
        int len = dp.getLength();//实际接收的数据的长度
        System.out.println(new String(result,0,len));

        //5、关闭
        ds.close();
    }
}
