package com.yyds.reflect;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 通过反射执行方法
 */
public class TestMethod {
    //执行无参数无返回值的方法
    @Test
    public void test01() throws Exception{
        //1.获取类的完整路径字符串
        String className = "com.yyds.reflect.Student";
        //2.根据类的完整路径字符串获取Class对象
        Class<?> clazz = Class.forName(className);
        //3.使用反射通过无参构造方法创建对象
        Object stu = clazz.newInstance();
        //4.从Class对象中获取指定的方法
        Method method = clazz.getMethod("shout");
        //5.执行方法
        method.invoke(stu);
    }

    //执行有参数有返回值的方法
    @Test
    public void test02() throws Exception{
        //1.获取类的完整路径字符串
        String className = "com.yyds.reflect.Student";
        //2.根据类的完整路径字符串获取Class对象
        Class<?> clazz = Class.forName(className);
        //3.使用反射通过无参构造方法创建对象
//        Object stu1 = clazz.newInstance();
        //使用反射通过有参构造方法创建对象
        Object stu2 = clazz.getConstructor(int.class, String.class, Double.class).newInstance(1,"张三",98.5);
        //4.从Class对象中获取指定的方法
        Method method = clazz.getMethod("add", int.class, int.class);
        //5.执行方法
        Object result = method.invoke(stu2, 100, 200);
        System.out.println("result = " + result);
    }

    //执行静态方法
    @Test
    public void test03() throws Exception{
        //1.获取类的完整路径字符串
        String className = "com.yyds.reflect.Student";
        //2.根据路径获取Class对象
        Class<?> clazz = Class.forName(className);
        //3.从Class对象中获取指定的方法
        Method method = clazz.getMethod("sleep");
        //4.执行方法
        method.invoke(null);//调用静态方法,对象名写null
    }
}
