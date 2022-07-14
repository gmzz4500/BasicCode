package com.yyds.reflect;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 使用反射操作成员变量： 赋值和取值
 * 不是调用相应的setter和getter，而是直接操作成员变量
 *
 * 此操作使用并不多，更多的还是通过setter和getter方法来对属性进行操作，尽管反射可以直接操作private类型的属性
 */
public class TestField {
    @Test
    public void test01() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        //1.获取类的完整路径字符串
        String className = "com.yyds.reflect.Student";
        //2.根据类的完整路径字符串获取Class对象
        Class<?> clazz = Class.forName(className);
        //3.使用反射通过无参数构造方法创建对象
//        Object stu = clazz.getConstructor().newInstance();

        Object stu = clazz.newInstance();
        //4.从Class对象中获取指定的属性
        Field field = clazz.getDeclaredField("sno");
        field.setAccessible(true);
        //5.使用反射给属性赋值
        field.setInt(stu,2);
        //6.使用反射获取属性的值
        System.out.println(field.getInt(stu));
    }
}
