package com.yyds.c_duration;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationDemo {
    public static void main(String[] args) {
        //时分秒的时间间隔对象
        Duration between = Duration.between(LocalDateTime.of(1996, 4, 17, 8, 8, 8),LocalDateTime.now());
        System.out.println("between = " + between);//between = PT226981H3M54.345S

        long days = between.toDays();
        System.out.println("人的一生可以活三万多天,您已经活了" + days + "天,请珍爱生命~");
    }
}
