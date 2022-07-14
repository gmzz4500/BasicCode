package com.yyds.annotation2;

import java.lang.reflect.Field;

public class Test {
    //读取类上面的注解@Table
    @org.junit.Test
    public void test01(){
       //1.获取Department类的Class对象
        Class<Department> clazz = Department.class;
        //2.从Class对象中获取类上面的注解@Table
//        Annotation[] annotations = clazz.getAnnotations();
//        for (Annotation annotation : annotations) {
//            System.out.println(annotation);
//        }
        Table tableAnnotation = clazz.getAnnotation(Table.class);
        //3.获取@Table注解的配置参数的值
        System.out.println(tableAnnotation);
        System.out.println(tableAnnotation.value());
    }
    @org.junit.Test
    public void test02() throws NoSuchFieldException {
        //1.获取Department类的Class对象
        Class<Department> clazz = Department.class;
        //2.从Class对象中获取指定的成员变量
        Field deptNameField = clazz.getDeclaredField("deptName");
        //3.获取改Field上的指定的注解
        Column column = deptNameField.getAnnotation(Column.class);
        //4.获取该注解的各个配置参数
        System.out.println(column.columnName());
        System.out.println(column.columnType());
        System.out.println(column.length());
    }
}
