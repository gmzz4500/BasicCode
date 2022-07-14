package com.yyds.c_visit1;

//同包不同类
public class Demo1 {
    public void show(){
        Demo demo = new Demo();
        demo.publicShow();
        demo.protectedShow();
        demo.defaultShow();
//        demo.privateShow;
    }
}
