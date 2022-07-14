package com.yyds.b_period;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDemo {
    public static void main(String[] args) {
        //年月日的时间间隔对象
        Period between = Period.between(LocalDate.of(1996, 4, 1), LocalDate.now());
        System.out.println("between = " + between);//between = P25Y11M8D

        int days = between.getDays();
        System.out.println("days = " + days);

        long days1 = between.get(ChronoUnit.DAYS);
        System.out.println("days1 = " + days1);
    }
}
