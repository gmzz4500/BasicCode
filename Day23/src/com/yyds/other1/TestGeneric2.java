package com.yyds.other1;

import com.yyds.annotation.Student;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class TestGeneric2 {
    public void method1(Map<Integer, Student> map, List<Student> list, String str){

    }
    public Map<Integer,Student> method2(){
        return null;
    }
    @Test
    public void test01() throws NoSuchMethodException {
        //1.获取TestGeneric2类的Class对象
        Class<TestGeneric2> clazz = TestGeneric2.class;
        //2.获取method2方法
        Method method2 = clazz.getMethod("method2");
        //3.获取method2方法的返回值:不带泛型
        //Class<?> returnType = method2.getReturnType();
        //System.out.println(returnType);//interface java.util.Map
        //3.获取method2方法的返回值:带泛型
        Type genericReturnType = method2.getGenericReturnType();
        System.out.println(genericReturnType);//java.util.Map<java.lang.Integer, com.yyds.annotation.Student>
        ParameterizedType pt = (ParameterizedType) genericReturnType;
        Type[] actualTypeArguments = pt.getActualTypeArguments();
        for (Type actualTypeArgument : actualTypeArguments) {
            System.out.println(actualTypeArgument);
        }

    }

    //获取方法的参数中的泛型信息
    @Test
    public void test02() throws NoSuchMethodException {
        //1.获取TestGeneric2类的Class对象
        Class<TestGeneric2> clazz = TestGeneric2.class;
        //2.获取method2方法
        Method method = clazz.getMethod("method1", Map.class, List.class, String.class);
        //3.获取参数列表:不带泛型
        //method2.getParameterTypes();
        //3.获取参数列表:带泛型
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println(genericParameterType);
            if(genericParameterType instanceof ParameterizedType){
                ParameterizedType pt = (ParameterizedType) genericParameterType;
                Type[] actualTypeArguments = pt.getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println("        " + actualTypeArgument);
                }
            }
        }
    }
}
