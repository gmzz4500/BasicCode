package com.yyds.homework.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Server {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("星期一", "Monday");
        dictionary.put("星期二", "Tuesday");
        dictionary.put("星期三", "Wednesday");
        dictionary.put("星期四", "Thursday");
        dictionary.put("星期五", "Friday");
        dictionary.put("星期六", "Saturday");
        dictionary.put("星期天", "Sunday");
        //创建ServerSocket
        ServerSocket serverSocket = new ServerSocket(8888);
        //使用ServerSocket监听客户端的请求
        Socket socket = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream ps = new PrintStream(socket.getOutputStream());
        while (true){
            String word = br.readLine();
            if ("-1".equals(word)){
                break;
            }
            Set<Map.Entry<String, String>> entries = dictionary.entrySet();
            int index = -1;
            for (Map.Entry<String, String> entry : entries) {
                String english = entry.getValue();
                String chinese = entry.getKey();
                if (chinese.equals(word)) {
                    ps.println(word + "对应的单词是: " + english);
                    index = 1;
                }
            }
            if (index == -1) {
                ps.println("没有找到");
            }
        }
        //关闭流
        br.close();
        ps.close();
    }
}
