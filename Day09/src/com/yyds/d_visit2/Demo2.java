package com.yyds.d_visit2;

import com.yyds.c_visit1.Demo;

public class Demo2 {
    //不同包的无关类
    public void show(){
        Demo demo = new Demo();
        demo.publicShow();
//        demo.protectedShow();
//        demo.defaultShow();
//        demo.protectedShow();
    }
}
