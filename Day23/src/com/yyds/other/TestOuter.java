package com.yyds.other;

import org.junit.Test;

public class TestOuter {
    //获取内部类和内部接口
    @Test
    public void test01(){
        //获取外部类的Class对象
        Class<OuterClass> clazz = OuterClass.class;
        //从Class对象中获取内部类和内部接口信息
        //Class<?>[] classes = clazz.getClasses();//public
        Class<?>[] classes = clazz.getDeclaredClasses();
        for (Class<?> c : classes) {
            System.out.println(c);
        }
    }
    @Test
    public void test02(){
        //获取内部类的Class对象
        Class<OuterClass.InnerClass1> clazz = OuterClass.InnerClass1.class;
        //从Class对象中获取外部类的信息
        Class<?> declaringClass = clazz.getDeclaringClass();
        System.out.println(declaringClass);
    }
}
