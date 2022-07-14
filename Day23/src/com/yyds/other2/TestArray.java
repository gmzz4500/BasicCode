package com.yyds.other2;

import org.junit.Test;

import java.lang.reflect.Array;

public class TestArray {
    @Test
    public void test01(){
        //不用反射
        String[] arr = new String[5];
        arr[0] = "北京";
        arr[1] = "上海";
        arr[2] = "天津";
        arr[3] = "武汉";
        arr[4] = "西安";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
    @Test
    public void test02() throws ClassNotFoundException {
        String elementType = "java.lang.String";
        int length = 5;
        //使用反射创建数组
        Object arr = Array.newInstance(Class.forName(elementType), length);
        //使用反射给数组赋值
        Array.set(arr,0,"北京");
        Array.set(arr,1,"上海");
        Array.set(arr,2,"西安");
        Array.set(arr,3,"武汉");
        //使用反射获取数组的值
        System.out.println(Array.get(arr,0));
        System.out.println(Array.get(arr,1));
        System.out.println(Array.get(arr,2));
        System.out.println(Array.get(arr,3));
        System.out.println(Array.get(arr,4));
    }
}
