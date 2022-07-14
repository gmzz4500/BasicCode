package com.yyds.other1;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TestGeneric {
    @Test
    public void test01(){
        //1.获取Son类的类对象
        Class<Son> clazz = Son.class;
        //2.获取Son类的父类的类对象:不带泛型
//        Class<? super Son2> superclass = clazz.getSuperclass();
//        System.out.println(superclass);
        //2.获取Son类的父类的类对象:带泛型
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);//Father<ja>
        //3.获取父类的类对象(Type,其实是一个Parameterizva.lang.String,java.lang.IntegeredType)
        if(genericSuperclass instanceof ParameterizedType){
            ParameterizedType pt = (ParameterizedType) genericSuperclass;
            Type[] actualTypeArguments = pt.getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
            }
        }
    }
}
//泛型形参:<T,U>
class Father<T,U>{

}
//泛型实参:<String,Integer>
class Son extends Father<String,Integer>{

}
class Son2 extends Father<String,Double>{

}
