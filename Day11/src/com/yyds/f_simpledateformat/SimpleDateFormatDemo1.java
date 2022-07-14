package com.yyds.f_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        //创建一个字符串时间
        String birthday = "1996年01月01日 00:00:00";

        //解析字符串时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//注意:字符串日期格式一定要和pattern一样

        //解析
        Date parseDate = sdf.parse(birthday);//编译时期异常,就抛出去

        System.out.println("parseDate = " + parseDate);//Mon Jan 01 00:00:00 CST 1996
    }
}
