package com.yyds.annotation2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义实体类的成员变量和数据库表的字段之间的映射
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    //配置参数列表
    String columnName();//deptno dname loc
    String columnType();//int varchar varchar
    int length() default 10;
}
