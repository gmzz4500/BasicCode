package com.yyds.c_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(0.1 * 0.8);

//        BigDecimal bd1 = 0.1;

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.8");

        System.out.println("bd1.add(bd2) = " + bd1.add(bd2));
        System.out.println("bd1.subtract(bd2) = " + bd1.subtract(bd2));
        System.out.println("bd1.multiply(bd2) = " + bd1.multiply(bd2));
        System.out.println("bd1.divide(bd2) = " + bd1.divide(bd2));

        //BigDecimal divide(BigDecimal divisor,int scale,RoundingMode roundingMode)
        //向上取整的舍入模式
        System.out.println("bd1.divide(bd2,2, RoundingMode.UP) = " + bd1.divide(bd2, 2, RoundingMode.UP));
        //向下取整的舍入模式
        System.out.println("bd1.divide(bd2,2, RoundingMode.DOWN) = " + bd1.divide(bd2, 2, RoundingMode.DOWN));
        //四舍五入的舍入模式
        System.out.println("bd1.divide(bd2,2, RoundingMode.HALF_UP) = " + bd1.divide(bd2, 2, RoundingMode.HALF_UP));
    }
}
