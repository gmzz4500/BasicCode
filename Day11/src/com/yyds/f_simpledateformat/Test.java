package com.yyds.f_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
        //计算你活到现在有多少日子

public class Test {
    public static void main(String[] args) throws ParseException {
        //键盘录入你的出生日期
        Scanner sc = new Scanner(System.in);
        //提示
        System.out.println("请您输入您的出生日期:(格式:yyyy-MM-dd HH:mm:ss)");
        //录入数据
        String birthday = sc.nextLine();
        //生日字符串 定位到 Date 上
        SimpleDateFormat sdf = new SimpleDateFormat(birthday);
        //解析
        Date birthDate = sdf.parse(birthday);
        //Date对象 变成 毫秒值 long
        long birthDateTime = birthDate.getTime();
        //获取现在的时间毫秒值
        long nowTime = System.currentTimeMillis();
        //计算
        long days = (nowTime - birthDateTime) / (1000 * 60 * 60 * 24);
        System.out.println("人的一生可以或三万多天,您已经活了" +days + "天,请珍爱生命~");
    }
}
