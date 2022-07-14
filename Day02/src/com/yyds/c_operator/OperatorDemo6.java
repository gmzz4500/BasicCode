package com.yyds.c_operator;
/*
    	& : 逻辑与  -> 并且  "苛刻的丈母娘"
		运算法则 :有false则为false
			10 < a < 20; : a > 10 & a < 20;

	| : 逻辑或 -> 或者 "和蔼美丽的丈母娘"
		运算法则 :有true则为true
			a > 20 或者 a < 10 : a > 10 | a > 20;

	^ : 逻辑异或 "中国的领结婚证关系"
		运算法则 : 相同则为false,不同则为true

	! : 逻辑非
		运算法则 : 取反 true则false,false则true
 */
public class OperatorDemo6 {
    public static void main(String[] args) {
        //&
        System.out.println(true & true);
        System.out.println(false & true);
        System.out.println(true & false);
        System.out.println(false & false);
        System.out.println("-------------------");
        //|
        System.out.println(true | true);
        System.out.println(false | true);
        System.out.println(true | false);
        System.out.println(false | false);
        System.out.println("-------------------");
        //^
        System.out.println(true ^ true);
        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        System.out.println("-------------------");
        //!
        System.out.println(!true);
        System.out.println(!!true);

        System.out.println("-------------------");
        //&&
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println("-------------------");
        //||
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);
    }
}
