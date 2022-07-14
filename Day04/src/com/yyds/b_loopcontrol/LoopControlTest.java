package com.yyds.b_loopcontrol;

public class LoopControlTest {
    public static void main(String[] args) {
        //for循环
        for (int i = 0; i < 10; i++) {
            if(i % 3 == 0){
                System.out.println("Hello" + i);
            }
            System.out.println("Hello" + i);
        }
    }
}
