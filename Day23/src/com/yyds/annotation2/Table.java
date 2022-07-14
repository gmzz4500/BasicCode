package com.yyds.annotation2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 表主键,用来定义实体类和数据库的映射
 */
@Target(value= ElementType.TYPE)//只能作用在类上
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    //配置参数
    String value();
}
