package com.yyds.d_visit2;

import com.yyds.c_visit1.Demo;

public class Zi extends Demo {
    //不同包,有继承关系
    public void show(){
        publicShow();
        protectedShow();
//        defaultShow();
//        privateShow();
    }
}
