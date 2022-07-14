package com.yyds.b_recursion;

/*
    求阶乘
 */
public class Factorial {
    public static void main(String[] args) {
        double factorial = getFactorial(1000);
        System.out.println("factorial = " + factorial);
    }

    public static double getFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
