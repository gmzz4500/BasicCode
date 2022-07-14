package com.yyds.c_visit1;

public class Demo {
    public void publicShow(){

    }

    protected void protectedShow(){

    }

    void defaultShow(){

    }

    private void privateShow(){

    }
    //在同一个类
    public void show(){
        publicShow();
        protectedShow();
        defaultShow();
        privateShow();
    }
}
