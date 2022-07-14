package com.yyds.d_generic;

import com.yyds.a_map.Student;

import java.util.ArrayList;
import java.util.Collections;

public class GenericMethodDemo {
    public static void main(String[] args) {
        show(100);

        show(new Student());

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Student> list3 = new ArrayList<>();

        Collections.addAll(list1,1,2,3,4,5);
    }

    public static<E> void show(E e){
        //在方法内就多了一个引用数据类型E供你使用
        System.out.println("e = " + e);
        System.out.println("e.getClass() = " + e.getClass());
    }
}
