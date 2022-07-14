package com.yyds.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用反射创建对象
 */
public class TestConstructor {
    //无参数构造方法
    //方式1:调用Construction的newInstance()
    //方式2:调用Class的newInstance()只针对无参数构造方法
    @Test
    public void test01() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        //1.读取配置文件获取类的完整路径字符串
        String className = "com.yyds.reflect.Student";
        //2.根据类的完整路径字符串获取类的Class对象
        Class<?> clazz = Class.forName(className);
        //3.从Class对象中获取无参数构造方法
//        Constructor<?> constructor = clazz.getConstructor();
        //4.通过无参数构造方法,使用反射创建对象
//        Object stu1 = constructor.newInstance();
//        clazz.getConstructor().newInstance()
        Object stu1 = clazz.newInstance();
        System.out.println(stu1);

    }
    @Test
    public void test02() throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        //1.读取配置文件获取类的完整路径字符串
        String className = "com.yyds.reflect.Student";
        //2.根据类的完整路径字符串获取类的Class对象
        Class clazz = Class.forName(className);
        //3.从Class对象中获取有参数构造方法
        Constructor constructor = clazz.getConstructor(int.class, String.class, Double.class);
        //4.通过有参数构造放啊发,使用反射创建对象
        Object stu2 = constructor.newInstance(1, "张飒", 98.0);
        System.out.println("stu2 = " + stu2);
    }
    @Test
    public void test03() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.读取配置文件获取类的完整路径字符串
        String className = "com.yyds.reflect.Student";
        //2.根据类的完整路径字符串获取类的Class对象
        Class<?> clazz = Class.forName(className);
        //3.从Class对象中获取有参构造方法
        Constructor<?> constructor = clazz.getDeclaredConstructor(int.class, String.class);
        //4.通过有参数构造方法,使用反射创建对象
        constructor.setAccessible(true);//即使非public也可以访问
        Object stu2 = constructor.newInstance(1, "李四");
        System.out.println("stu2 = " + stu2);
        /*
            反射的有点:功能强大
            1.编译的时候不知道类和对象的信息,需要在运行的时候才能获取类或
            对象的信息,此时必须使用反射
            2.可以突破权限修饰符的限制,即使private修饰的也可以操作

            反射的缺点:
            1.代码可读性差,代码量多,执行效率低
            2.可以突破权限修饰符的限制,即使private修饰的也可以操作,
            不安全
         */
    }

}
