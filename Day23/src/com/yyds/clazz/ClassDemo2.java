package com.yyds.clazz;

import org.junit.Test;

/**
 * 如何得到Class对象（四种方式）
 * 方式1： 类名.class
 * 可以获取各种类型的Class对象  前提：编译的时候已经知道了类或者对象的具体信息
 * 方式2：对象名.getClass()
 * 必须先创建对象，才能使用  前提：编译的时候已经知道了类或者对象的具体信息
 * 方式3：Class.forName(className);
 * 编译的时候不知道了类或者对象的具体信息，需要运行时解析配置文件或者类的完整路径信息
 * 和反射有关了
 * 方式4：ClassLoader.getSystemClassLoader().loadClass("com.atguigu.clazz.TestClass2");
 * 不常用
 */
public class ClassDemo2 {
    //    方式1： 类名.class
    @Test
    public void Test01() {
        Class clazz = String.class;
        System.out.println("clazz = " + clazz);
    }

    //    方式2：对象名.getClass()
    @Test
    public void Test02() {
        String str = "天道酬勤";
        Class clazz = str.getClass();
        System.out.println("clazz = " + clazz);
    }

    //    方式3：Class.forName(className);
    @Test
    public void Test03() throws ClassNotFoundException {
        String className = "java.lang.Integer";
        Class aClass = Class.forName(className);
        System.out.println("aClass = " + aClass);
    }

    //    方式4：ClassLoader.getSystemClassLoader().loadClass("com.atguigu.clazz.TestClass2");
    @Test
    public void Test04() throws ClassNotFoundException {
        Class aClass = ClassLoader.getSystemClassLoader().loadClass("com.yyds.clazz.ClassDemo2");
        System.out.println("aClass = " + aClass);
    }
}
