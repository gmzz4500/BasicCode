package com.yyds.clazz;

import org.junit.Test;

import java.lang.reflect.Modifier;

public class ClassDemo3 {
    //获取类的基本信息
    @Test
    public void test01(){
        //获取一个类的Class对象
        Class clazz = String.class;
        //从Class对象中获取类的基本信息
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage());
        System.out.println(clazz.getSuperclass());
        System.out.println(clazz.getInterfaces());
        System.out.println(clazz.getModifiers());//修饰符 17 = 16 final + 1 public
        System.out.println(Modifier.toString(clazz.getModifiers()));
    }
}
